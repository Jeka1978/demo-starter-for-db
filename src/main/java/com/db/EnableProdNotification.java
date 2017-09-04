package com.db;/**
 * Created by Evegeny on 04/09/2017.
 */

import com.db.conf.Config;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Import(Config.class)
public @interface EnableProdNotification {
}
