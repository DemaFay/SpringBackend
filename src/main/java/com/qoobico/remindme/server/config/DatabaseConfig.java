package com.qoobico.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by DemaFayz on 27.07.2016.
 */

@Configuration
@EnableJpaRepositories("com.qoobico.remindme.server.repository")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan("com.qoobico.remindme.server")
public class DatabaseConfig {

    private Environment env;
}
