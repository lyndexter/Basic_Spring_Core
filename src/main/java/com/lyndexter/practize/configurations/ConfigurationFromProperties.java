package com.lyndexter.practize.configurations;


import com.lyndexter.practize.beans.BeanB;
import com.lyndexter.practize.beans.BeanC;
import com.lyndexter.practize.beans.BeanD;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("init.properties")
public class ConfigurationFromProperties {
  @Value("${bean.name}")
  private String name;
  
  @Value("${bean.value}")
  private Integer value;
  
  @Bean(initMethod = "init", destroyMethod = "destroy")
  @DependsOn({"beanD", "beanB"})
  public BeanC getBeanC() {
    return new BeanC(name, value);
  }
  
  @Bean(name="beanB", initMethod = "init", destroyMethod = "destroy")
  public BeanB getBeanB() {
    return new BeanB(name, value);
  }
  
  @Bean(name="beanD", initMethod = "init", destroyMethod = "destroy")
  public BeanD getBeanD() {
    return new BeanD(name, value);
  }
}
