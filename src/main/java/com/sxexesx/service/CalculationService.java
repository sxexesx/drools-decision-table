package com.sxexesx.service;

import com.sxexesx.models.Store;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculationService {

    private KieContainer kieContainer;

    public CalculationService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public void calculateFare(List<Store> stores) {
        KieSession kieSession = kieContainer.newKieSession();
        stores.forEach(kieSession::insert);
        kieSession.fireAllRules();
        kieSession.dispose();
    }
}
