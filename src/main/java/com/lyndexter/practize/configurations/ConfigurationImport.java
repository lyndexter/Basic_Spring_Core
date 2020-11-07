package com.lyndexter.practize.configurations;

import com.lyndexter.practize.beans.BeanA;
import com.lyndexter.practize.beans.BeanB;
import com.lyndexter.practize.beans.BeanC;
import com.lyndexter.practize.beans.BeanD;
import com.lyndexter.practize.beans.BeanE;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
@Import(ConfigurationExport.class)
public class ConfigurationImport {
  
  
  @Bean("leon")
  public BeanA getBeanA1(BeanB beanB, BeanC beanC) {
    System.out.println("first initialise A");
    return new BeanA(beanB.getName(), beanC.getValue());
  }
  
  @Bean("beanA2")
  public BeanA getBeanA2(BeanB beanB, BeanD beanD) {
    System.out.println("second initialise A");
    return new BeanA(beanB.getName(), beanD.getValue());
  }
  
  
  @Bean
  @Primary
  public BeanA getBeanA3(BeanC beanC, BeanD beanD) {
    System.out.println("third initialise A");
    return new BeanA(beanC.getName(), beanD.getValue());
  }
  
  @Bean("beanE1")
  public BeanE getBeanE1(BeanA leon) {
    System.out.println("first initialise E");
    return new BeanE(leon.getName(), leon.getValue());
  }
  
  @Bean("beanE2")
  public BeanE getBeanE2(BeanA getBeanA2) {
    System.out.println("first initialise E");
    return new BeanE(getBeanA2.getName(), getBeanA2.getValue());
  }
  
  
  @Bean("beanE3")
  public BeanE getBeanE3(BeanA getBeanA3) {
    System.out.println("first initialise E");
    return new BeanE(getBeanA3.getName(), getBeanA3.getValue());
  }
  
  
}
