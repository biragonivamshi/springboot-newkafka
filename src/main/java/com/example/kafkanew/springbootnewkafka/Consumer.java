package com.example.kafkanew.springbootnewkafka;

//import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@Service
public class Consumer {
    
    	
    @KafkaListener(topics = "test_topic", groupId = "group_id")
    @CircuitBreaker(name="consumeMessage", fallbackMethod = "handleFallback")
    public void consumeMessage(String message){
    	if(message.equals("error"))
            throw new RuntimeException("Kafka service is down.");
    	else
    		System.out.println(message);
    }
    
    public void handleFallback(String message,Exception e) {
         System.out.println("Fallback method triggered: Error occurred during message processing.");
    }
}
