package com.example.kafka_producer_Project;

import com.example.kafka_producer_Project.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

@EnableBinding(Source.class)
@Service
public class BookProducerImpl implements BookProducerInterface {

    @Autowired
    @Qualifier("output")
    private MessageChannel messageChannel;

    @Override
    public void produce(Book book) {
        messageChannel.send(MessageBuilder.withPayload(book).build());
    }
}
