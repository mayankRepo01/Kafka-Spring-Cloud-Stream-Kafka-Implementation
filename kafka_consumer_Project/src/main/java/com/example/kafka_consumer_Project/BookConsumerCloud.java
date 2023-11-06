package com.example.kafka_consumer_Project;

import com.example.kafka_consumer_Project.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(Sink.class)
public class BookConsumerCloud {
    Logger logger= LoggerFactory.getLogger(BookConsumerCloud.class);
    @StreamListener("input")
    public void consumeMessage(Book book){

        logger.info("Consume Book Payload:- "+book);

    }
}
