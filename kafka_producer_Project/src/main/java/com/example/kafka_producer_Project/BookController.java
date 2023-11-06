package com.example.kafka_producer_Project;

import com.example.kafka_producer_Project.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookProducerInterface bookProducerInterface;

    @PostMapping("/publish")
    Book publishEvent(@RequestBody Book book){
        bookProducerInterface.produce(book);
        return book;
    }
}
