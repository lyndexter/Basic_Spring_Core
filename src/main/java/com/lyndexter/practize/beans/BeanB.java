package com.lyndexter.practize.beans;

public class BeanB implements BeanValidator {
  private String name;
  
  private Integer value;
  
  public BeanB() {
    System.out.println("\nInitialise Bean B ");
  }
  
  public BeanB(String name, Integer value) {
    this.name = name;
    this.value = value;
    System.out.println("\nInitialise Bean B with full constructor");
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
    return "BeanB{" +
        "name='" + name + '\'' +
        ", value='" + value + '\'' +
        '}';
  }
  
  @Override public Boolean validate() {
    return !name.equals("") && value>0;
  }
  
  private void init() {
    System.out.println("initialise Bean B");
  }
  
  private void destroy() {
    System.out.println("destroy Bean B");
  }
  
  private  void  initialise(){
    System.out.println("\n-----------------------\nChange init method in Bean B");
  }
}
