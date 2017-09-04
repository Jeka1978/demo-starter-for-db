package com.db.infra;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by Evegeny on 04/09/2017.
 */


public class ProdNotificationListener implements ApplicationListener<ContextRefreshedEvent> {

    private void sendMail() {
        System.out.println("продакшн взлетел на воздух");
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        sendMail();
    }
}
