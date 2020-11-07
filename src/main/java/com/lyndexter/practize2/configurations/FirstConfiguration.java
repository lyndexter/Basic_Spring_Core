package com.lyndexter.practize2.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan("com.lyndexter.practize2.injections")
@ComponentScan("com.lyndexter.practize2.beans1")
@ComponentScan("com.lyndexter.practize2.outherbeans")
@Profile("first")
public class FirstConfiguration {


}
