package com.hotels.bookclub.cmdpattern.items;

public class Garage {
  private final String name;

  public Garage(String name) {
    this.name = name;
  }

  public void open() {
    System.out.println(name + " Garage is open.");
  }

  public void close() {
    System.out.println(name + " Garage is closed.");
  }
}
