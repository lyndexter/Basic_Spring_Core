package com.lyndexter.practize.configurations;

import com.lyndexter.practize.beans.BeanF;
import com.lyndexter.practize.beans.GeneralBeanFactory;
import com.lyndexter.practize.beans.PostBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class ConfigurationExport {
  
  @Bean
  @Lazy
  public BeanF getBeanF() {
    return new BeanF("Georg",-4);
  }
  
  @Bean
  public GeneralBeanFactory getBeanFactory() {
    return new GeneralBeanFactory();
  }
  
  @Bean
  public PostBean getPostBean() {
    return new PostBean();
  }
}
