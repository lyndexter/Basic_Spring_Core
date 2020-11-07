package com.lyndexter.practize2.beans1;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
@Primary
public class BeanC implements MyInterface {
  public BeanC() {
    System.out.println("Create Bean C");
  }
  
  @Override public String getMyObject() {
    return "Bean C";
  }
  
  
}

