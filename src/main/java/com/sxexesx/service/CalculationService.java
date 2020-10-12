package com.sxexesx.service;

import com.sxexesx.model.Respondent;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    private KieContainer kieContainer;

    public CalculationService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public void calculateRules(Respondent store) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(store);
        kieSession.fireAllRules();
        kieSession.dispose();
    }
}
