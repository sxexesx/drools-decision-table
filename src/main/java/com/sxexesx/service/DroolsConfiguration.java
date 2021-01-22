package com.sxexesx.service;

import org.drools.decisiontable.DecisionTableProviderImpl;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsConfiguration {

    /*
        Path to drools rules fine
     */
    private static final String drlFile = "rules.drl";
    private static final String xlsFile = "rules_cartoon.xls";

    @Bean
    public KieContainer kieContainer() {
        KieServices kieServices = KieServices.Factory.get();

        System.out.println(readDrl(xlsFile, DroolsConfiguration.class));

        Resource dt = ResourceFactory.newClassPathResource(xlsFile, getClass());
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem().write(dt);

        KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem);
        kieBuilder.buildAll();
        kieBuilder.getResults().getMessages().forEach(System.out::println);

        KieModule kieModule = kieBuilder.getKieModule();
        return kieServices.newKieContainer(kieModule.getReleaseId());
    }

    public String readDrl(String fileName, Class<DroolsConfiguration> cls) {
        DecisionTableProviderImpl decisionTableProvider = new DecisionTableProviderImpl();
        return decisionTableProvider.loadFromResource(ResourceFactory.newClassPathResource(fileName, cls), null);
    }

}
