package com.qoobico.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by DemaFayz on 26.07.2016.
 */

/**
 * @Configuration - это конфигурация которую нужно выполнять перед тем как разварачивать конфигурацию спринга
 * @EnableWebMvc - должны включить web mvc что даст возможность использования контроллеров и REST контроллеров
 * @ComponentScan - где мы должны искать все наши компоненты
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.qoobico.remindme.server.")
public class WebConfig extends WebMvcConfigurerAdapter {
}
