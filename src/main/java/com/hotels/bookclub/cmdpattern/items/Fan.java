package com.hotels.bookclub.cmdpattern.items;

public class Fan {
  private final String name;

  public Fan(String name) {
    this.name = name;
  }

  public void on() {
    System.out.println(name + " Fan is on.");
  }

  public void off() {
    System.out.println(name + " Fan is off.");
  }
}
