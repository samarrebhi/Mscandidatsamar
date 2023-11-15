package com.mscandiate.mscandidate;

import com.mscandiate.mscandidate.Repositories.CandidatRepository;
import com.mscandiate.mscandidate.entities.Candidat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MsCandidateApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsCandidateApplication.class, args);
    }

    @Autowired
    private CandidatRepository repository;

    @Bean
    ApplicationRunner init() {
        return (args) -> {
            repository.save(new Candidat("Mariem", "Ch", "ma@esprit.tn"));
            repository.save(new Candidat("Sarra", "ab", "sa@esprit.tn"));
            repository.save(new Candidat("Mohamed", "ba", "mo@esprit.tn"));
            repository.findAll().forEach(System.out::println);
        };
    }

}
