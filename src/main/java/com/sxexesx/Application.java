package com.sxexesx;

import com.sxexesx.model.Respondent;
import com.sxexesx.service.CalculationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

        Respondent respondent = new Respondent("true");
        service.calculateRules(respondent);

        Map<String, String> result = respondent.getResult();
        for (Map.Entry<String, String> entry : result.entrySet()) {
            System.out.printf("%s:%s%n", entry.getKey(), entry.getValue());
        }


    }
}
