package com.myFilter.config;

import com.myFilter.filters.myFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class FilterRegisterConfig {

    @Bean
    public FilterRegistrationBean<myFilter> myFilterBean() {

        FilterRegistrationBean<myFilter> result = new FilterRegistrationBean<>();

        result.setFilter(new myFilter());

        String[] urlPatterns = {"/get1"};

        result.addUrlPatterns(urlPatterns);

        return result;

    }
}
