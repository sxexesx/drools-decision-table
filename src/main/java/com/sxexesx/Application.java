package com.sxexesx;

import com.sxexesx.data.PersonData;
import com.sxexesx.data.RespondentData;
import com.sxexesx.model.Person;
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

        List<Person> personsData = PersonData.getPersonData();
        service.calculateRules(personsData);

        for (Person person : personsData) {
            System.out.printf("%s%n", person.getAge());
        }

    }
}
