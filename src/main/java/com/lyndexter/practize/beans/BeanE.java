package com.lyndexter.practize.beans;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanE implements BeanValidator {
  
  private String name;
  
  private Integer value;
  
  public BeanE() {
    System.out.println("Initialise Bean E");
  }
  
  public BeanE(String name, Integer value) {
    this.name = name;
    this.value = value;
    System.out.println("Initialise Bean E with full constructor");
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
    return "BeanE{" +
        "name='" + name + '\'' +
        ", value='" + value + '\'' +
        '}';
  }
  
  @Override public Boolean validate() {
    return !name.equals("") && value>0;
  }
  
  
  @PostConstruct
  public void initialiseBean() {
    System.out.println("invoke PostConstruct for bean E");
  }
  
  @PreDestroy
  public void destroy() {
    System.out.println("invoke PreDestroy for Bean E");
  }
}


