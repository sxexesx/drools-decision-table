package com.sxexesx.service;

import com.sxexesx.model.ResultStorage;
import com.sxexesx.model.Store;
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

    public void calculateRules(List<Store> stores, ResultStorage resultStorage) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("resultStorage", resultStorage);
        stores.forEach(kieSession::insert);
        kieSession.fireAllRules();
        kieSession.dispose();
    }
}
