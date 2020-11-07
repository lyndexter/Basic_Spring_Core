package com.lyndexter.practize2.outherbeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mybean")
public class OtherBeanC {
  public OtherBeanC() {
    System.out.println("Create Other Bean C");
  }
}
