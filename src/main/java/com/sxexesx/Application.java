package com.sxexesx;

import com.sxexesx.model.ResultStorage;
import com.sxexesx.model.Store;
import com.sxexesx.service.CalculationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

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

        List<Store> stores = Arrays.asList(
                new Store("true"),
                new Store("true"));

        ResultStorage result = new ResultStorage();

        service.calculateRules(stores, result);

        Map<String, String> result1 = result.getResult();


    }
}
