package com.example.kafka_consumer_Project;

import com.example.kafka_consumer_Project.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;




@SpringBootApplication
public class KafkaConsumerProjectApplication {
	private Logger logger= LoggerFactory.getLogger(KafkaConsumerProjectApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerProjectApplication.class, args);
	}

}
