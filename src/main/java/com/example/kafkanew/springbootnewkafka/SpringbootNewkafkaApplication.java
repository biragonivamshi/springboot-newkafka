package com.example.kafkanew.springbootnewkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class SpringbootNewkafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootNewkafkaApplication.class, args);
		System.out.println("kafka running..");
	}
}
