package com.lyndexter.practize2.outherbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class OtherBeanA {
  public OtherBeanA() {
    System.out.println("Create Other Bean A");
  }
}
