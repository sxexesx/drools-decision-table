package com.sxexesx;

import com.sxexesx.models.Store;
import com.sxexesx.service.CalculationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

    CalculationService service;

    public Application(CalculationService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        List<Store> stores = Arrays.asList(new Store(true),
                new Store(true));

        service.calculateFare(stores);
    }
}
