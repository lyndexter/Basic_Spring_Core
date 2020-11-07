package com.lyndexter.practize2.beans1;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class BeanWithCollection {
  
  private List<MyInterface> myObjects;
  
  public BeanWithCollection(List<MyInterface> myInterfaces) {
    this.myObjects = myInterfaces;
  }
  
  public void outputMyObjects() {
    for (MyInterface myObject : myObjects) {
      System.out.println(myObject.getMyObject());
    }
  }
}
