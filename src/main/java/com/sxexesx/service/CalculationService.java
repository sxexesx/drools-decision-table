package com.sxexesx.service;

import com.sxexesx.model.Respondent;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculationService {

    private final KieContainer kieContainer;

    public CalculationService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public void calculateRules(List<Respondent> respondents) {
        KieSession kieSession = kieContainer.newKieSession();
        respondents.forEach(kieSession::insert);
        kieSession.fireAllRules();
        kieSession.dispose();
    }
}
