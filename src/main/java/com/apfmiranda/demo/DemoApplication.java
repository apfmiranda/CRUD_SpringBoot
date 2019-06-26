package com.apfmiranda.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.apfmiranda.demo.domain.Contact;
import com.apfmiranda.demo.repositories.ContactRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner init(ContactRepository repository) {
        return args -> {
            repository.deleteAll();
            int qtd = 5;
            
            for (int i = 1; i < qtd + 1; i++) {
            	Contact c = new Contact();
                c.setName("Contato " + i);
                c.setEmail("contato" + i + "@email.com");
                c.getPhones().addAll(Arrays.asList("(111) 111-111", "(222) 222-222", "(333) 333-333"));
                repository.save(c);
            }
            
        };
    }

}
