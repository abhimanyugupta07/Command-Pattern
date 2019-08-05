package com.hotels.bookclub.cmdpattern.items;

public class Light {
  private final String name;

  public Light(String name) {
    this.name = name;
  }

  public void turnOn() {
    System.out.println(name + " Light is on.");
  }

  public void turnOff() {
    System.out.println(name + " Light is off.");
  }

}
