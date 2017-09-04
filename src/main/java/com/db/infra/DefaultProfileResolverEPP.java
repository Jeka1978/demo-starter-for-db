package com.db.infra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Created by Evegeny on 04/09/2017.
 */
public class DefaultProfileResolverEPP implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication springApplication) {
        if (environment.getActiveProfiles().length == 0) {
            if (System.getenv().get("OS").toLowerCase().contains("windows")) {
                environment.setActiveProfiles("DEV");
            }
        }
    }
}
