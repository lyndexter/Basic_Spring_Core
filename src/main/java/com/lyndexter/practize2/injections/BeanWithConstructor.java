package com.lyndexter.practize2.injections;

import com.lyndexter.practize2.outherbeans.OtherBeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanWithConstructor {
  
  @Autowired
  public BeanWithConstructor(OtherBeanA otherBeanA) {
    System.out.println("Create BeanWithConstructor");
    System.out.println("From: " + otherBeanA);
  }
}
