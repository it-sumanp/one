package me.ifelse.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OneApplication {
    public static void main(String[] args) {
        SpringApplication.run(OneApplication.class, args);
    }
}



