package com.lyndexter.practize2.injections;

import com.lyndexter.practize2.outherbeans.OtherBeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanWithSetter {
  
  private OtherBeanC otherBeanC;
  
  @Autowired
  @Qualifier("mybean")
  public void setOtherBean(OtherBeanC otherBeanC) {
    this.otherBeanC = otherBeanC;
    System.out.println("Set the bean into another");
  }
  
}
