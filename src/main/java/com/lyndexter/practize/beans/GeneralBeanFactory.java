package com.lyndexter.practize.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class GeneralBeanFactory implements BeanFactoryPostProcessor {
  @Override public void postProcessBeanFactory(
      ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
    for (String beanName : configurableListableBeanFactory.getBeanDefinitionNames()) {
      
      System.out.println(configurableListableBeanFactory.getBeanDefinition(beanName));
      
      if (beanName.equals("beanB")) {
        BeanDefinition beanB = configurableListableBeanFactory.getBeanDefinition(beanName);
        beanB.setInitMethodName("initialise");
        System.out.println("changing init methods");
      }
    }
  }
}
