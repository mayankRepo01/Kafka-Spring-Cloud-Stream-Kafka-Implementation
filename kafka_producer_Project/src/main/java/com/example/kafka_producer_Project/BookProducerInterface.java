package com.example.kafka_producer_Project;

import com.example.kafka_producer_Project.model.Book;

public interface BookProducerInterface {
    void produce(Book book);
}
