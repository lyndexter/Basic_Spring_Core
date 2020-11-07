package com.lyndexter.practize2.outherbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class OtherBeanB {
  public OtherBeanB() {
    System.out.println("Create Other Bean B");
  }
}
