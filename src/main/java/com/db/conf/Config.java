package com.db.conf;

import com.db.infra.ProdNotificationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Evegeny on 04/09/2017.
 */
@Configuration
public class Config {


    @Bean
    @Profile("PROD")
    public ProdNotificationListener listener() {
        return new ProdNotificationListener();
    }
}
