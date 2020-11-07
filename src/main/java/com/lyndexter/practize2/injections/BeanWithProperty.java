package com.lyndexter.practize2.injections;

import com.lyndexter.practize2.outherbeans.OtherBeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanWithProperty {
  
  @Autowired
  private OtherBeanB otherBeanB;
}
