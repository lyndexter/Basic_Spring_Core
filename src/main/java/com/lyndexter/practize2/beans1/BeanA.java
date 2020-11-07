package com.lyndexter.practize2.beans1;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class BeanA implements MyInterface {
  public BeanA() {
    System.out.println("Create Bean A");
  }
  
  @Override public String getMyObject() {
    return "Bean A";
  }
}
