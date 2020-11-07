package com.lyndexter.practize.beans;

public class BeanF implements BeanValidator {
  
  private String name;
  
  private Integer value;
  
  public BeanF() {
    System.out.println("Initialise Bean F");
  }
  
  public BeanF(String name, Integer value) {
    this.name = name;
    this.value = value;
    System.out.println("Initialise Bean F with full constructor");
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
    return "BeanF{" +
        "name='" + name + '\'' +
        ", value='" + value + '\'' +
        '}';
  }
  
  @Override public Boolean validate() {
    return !name.equals("") && value > 0;
  }
}
