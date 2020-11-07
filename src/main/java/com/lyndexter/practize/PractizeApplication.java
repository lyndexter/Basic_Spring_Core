package com.lyndexter.practize;

import com.lyndexter.practize.beans.BeanA;
import com.lyndexter.practize.beans.BeanB;
import com.lyndexter.practize.beans.BeanC;
import com.lyndexter.practize.beans.BeanD;
import com.lyndexter.practize.beans.BeanF;
import com.lyndexter.practize.configurations.ConfigurationFromProperties;
import com.lyndexter.practize.configurations.ConfigurationImport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PractizeApplication {
  
  public static void main(String[] args) {
    SpringApplication.run(PractizeApplication.class, args);
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
        ConfigurationFromProperties.class, ConfigurationImport.class);
    
    BeanA beanA = (BeanA) applicationContext.getBean("leon");
    System.out.println(beanA);
    
    BeanF beanF = (BeanF) applicationContext.getBean(BeanF.class);
    
    
    System.out.println(applicationContext.getBean("beanA2"));
    System.out.println(applicationContext.getBean(BeanA.class));
    System.out.println(applicationContext.getBean("beanE1"));
    System.out.println(applicationContext.getBean("beanE2"));
    System.out.println(applicationContext.getBean("beanE3"));
    System.out.println(applicationContext.getBean(BeanC.class));
    System.out.println(applicationContext.getBean(BeanB.class));
    System.out.println(applicationContext.getBean(BeanD.class));
    System.out.println(applicationContext.getBean(BeanF.class));
  }
  
}
