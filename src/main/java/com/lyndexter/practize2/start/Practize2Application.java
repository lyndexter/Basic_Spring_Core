package com.lyndexter.practize2.start;

import com.lyndexter.practize2.beans1.BeanWithCollection;
import com.lyndexter.practize2.beans1.BeanWithCollections2;
import com.lyndexter.practize2.configurations.FirstConfiguration;
import com.lyndexter.practize2.configurations.SecondConfiguration;
import com.lyndexter.practize2.outherbeans.OtherBeanA;
import com.lyndexter.practize2.outherbeans.OtherBeanB;
import com.lyndexter.practize2.outherbeans.OtherBeanC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.AbstractEnvironment;

@SpringBootApplication
public class Practize2Application {
  
  public static void main(String[] args) {
    SpringApplication.run(Practize2Application.class, args);
    System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "first");
    ApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(FirstConfiguration.class, SecondConfiguration.class);
    
    
    BeanWithCollection beanWithCollection = applicationContext.getBean(BeanWithCollection.class);

    beanWithCollection.outputMyObjects();

    BeanWithCollections2 beanWithCollections2 =
        applicationContext.getBean((BeanWithCollections2.class));

    beanWithCollections2.outputMyObjects();


    OtherBeanA otherBeanA1 = applicationContext.getBean(OtherBeanA.class);
    OtherBeanA otherBeanA2 = applicationContext.getBean(OtherBeanA.class);
    OtherBeanB otherBeanB1 = applicationContext.getBean(OtherBeanB.class);
    OtherBeanB otherBeanB2 = applicationContext.getBean(OtherBeanB.class);
    OtherBeanC otherBeanC1 = applicationContext.getBean(OtherBeanC.class);
    OtherBeanC otherBeanC2 = applicationContext.getBean(OtherBeanC.class);


    System.out.println(otherBeanA1);
    System.out.println(otherBeanA2);
    System.out.println(otherBeanB1);
    System.out.println(otherBeanB2);
    System.out.println(otherBeanC1);
    System.out.println(otherBeanC2);
  }
  
}
