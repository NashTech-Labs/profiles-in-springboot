package com.knoldus.profilesDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

    @Autowired
    private EnvironmentDetails environmentDetails;

    /**
     *
     * @return
     */
    @Bean
    @Profile("dev")
    public EnvironmentDetails devEnv() {
        System.out.println("Dev Environment is Active.");
        System.out.println(environmentDetails.toString());
        return environmentDetails;
    }

    /**
     *
     * @return
     */
    @Bean
    @Profile("test")
    public EnvironmentDetails testEnv() {
        System.out.println("Test Environment is Active.");
        System.out.println(environmentDetails.toString());
        return environmentDetails;
    }

    /**
     *
     * @return
     */
    @Bean
    @Profile("prod")
    public EnvironmentDetails prodEnv() {
        System.out.println("Prod Environment is Active.");
        System.out.println(environmentDetails.toString());
        return environmentDetails;
    }
}
