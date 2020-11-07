package com.lyndexter.practize2.beans1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(7)
@Qualifier("someObject")
public class BeanB implements MyInterface{
  public BeanB() {
    System.out.println("Create Bean B");
  }
  
  @Override public String getMyObject() {
    return "Bean B";
  }
}
