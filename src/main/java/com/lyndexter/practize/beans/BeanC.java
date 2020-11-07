package com.lyndexter.practize.beans;

public class BeanC implements BeanValidator {
  
  private String name;
  
  private Integer value;
  
  public BeanC() {
    System.out.println("\nInitialise Bean C");
  }
  
  public BeanC(String name, Integer value) {
    this.name = name;
    this.value = value;
    System.out.println("\nInitialise Bean C with full constructor");
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
    return "BeanC{" +
        "name='" + name + '\'' +
        ", value='" + value + '\'' +
        '}';
  }
  
  @Override public Boolean validate() {
    return !name.equals("") && value>0;
  }
  
  private void init() {
    System.out.println("initialise Bean C");
  }
  
  private void destroy() {
    System.out.println("destroy bean C");
  }
}
