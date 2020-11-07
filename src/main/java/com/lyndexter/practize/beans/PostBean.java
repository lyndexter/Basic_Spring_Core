package com.lyndexter.practize.beans;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostBean implements BeanPostProcessor {
  
  @Override public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    System.out.println("before Initialising for " + beanName);
    return bean;
  }
  
  @Override public Object postProcessAfterInitialization(Object bean, String beanName)
      throws BeansException {
    System.out.println("post Initialising for " + beanName);
    if (bean instanceof BeanValidator) {
      System.out.println("Bean validate the pattern is " + ((BeanValidator) bean).validate());
    }
    return bean;
  }
}
