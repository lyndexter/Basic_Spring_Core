package com.lyndexter.practize.beans;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanA implements BeanValidator, InitializingBean, DisposableBean {
  
  private String name;
  
  private Integer value;
  
  public BeanA() {
    System.out.println("Initialise Bean A");
  }
  
  public BeanA(String name, Integer value) {
    this.name = name;
    this.value = value;
    System.out.println("Initialise Bean A with full constructor");
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public Integer getValue() {
    return value;
  }
  
  public void setValue(Integer value) {
    this.value = value;
  }
  
  @Override public String toString() {
    return "BeanA{" +
        "name='" + name + '\'' +
        ", value='" + value + '\'' +
        '}';
  }
  
  @Override public Boolean validate() {
    return !name.equals("") && value>0;
  }
  
  @Override public void destroy() throws Exception {
    System.out.println("Disposal destroy Bean A");
  }
  
  @Override public void afterPropertiesSet() throws Exception {
    System.out.println("InitialisingBean Bean A");
  }
}
