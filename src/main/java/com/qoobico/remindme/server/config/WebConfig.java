package com.qoobico.remindme.server.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Collections;
import java.util.List;

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

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setObjectMapper(new ObjectMapper());
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON));
        converters.add(converter);
    }
}
