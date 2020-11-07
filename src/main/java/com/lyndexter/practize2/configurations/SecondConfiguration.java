package com.lyndexter.practize2.configurations;

import com.lyndexter.practize2.beans3.BeanE;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan(value = "com.lyndexter.practize2.beans2")
@ComponentScan(value = "com.lyndexter.practize2.beans3", excludeFilters = {
    @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BeanE.class})})
@Profile("second")
public class SecondConfiguration {
}
