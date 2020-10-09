package com.sxexesx.service;

import com.sxexesx.models.Store;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxiFareCalculationService {

    private KieContainer kieContainer;

    public TaxiFareCalculationService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public void calculateFare(List<Store> stores) {
        KieSession kieSession = kieContainer.newKieSession();
        stores.forEach(kieSession::insert);
//        kieSession.insert(store);
        kieSession.fireAllRules();
        kieSession.dispose();
    }
}
