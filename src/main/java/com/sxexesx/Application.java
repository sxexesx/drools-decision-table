package com.sxexesx;

import com.sxexesx.data.RespondentData;
import com.sxexesx.model.Respondent;
import com.sxexesx.service.CalculationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
        List<Respondent> respondents = RespondentData.getRespondentData();

        service.calculateRules(respondents);

        for (Respondent rsp : respondents) {
            for (Map.Entry<String, String> entry : rsp.getResult().entrySet()) {
                System.out.printf("Respondent: %s; %s:%s%n", rsp.id, entry.getKey(), entry.getValue());
            }
        }

    }
}
