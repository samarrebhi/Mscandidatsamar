package com.example.stock_bibliotheque_microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
public class StockBibliothequeMicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockBibliothequeMicroservicesApplication.class, args);
    }

}
