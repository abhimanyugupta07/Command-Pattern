package com.hotels.bookclub.cmdpattern.items;

public class Tv {
  private final String name;

  public Tv(String name) {
    this.name = name;
  }

  public void on() {
    System.out.println(name + " Tv is on.");
  }

  public void off() {
    System.out.println(name + " Tv is off.");
  }
}
