package com.lyndexter.practize2.beans1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class BeanWithCollections2 {
  
  private final List<MyInterface> myObjects;
  
  public BeanWithCollections2(
      @Qualifier("someObject") List<MyInterface> myObjects) {this.myObjects = myObjects;}
  
  
  public void outputMyObjects() {
    for (MyInterface myObject : myObjects) {
      System.out.println(myObject.getMyObject());
    }
  }
}
