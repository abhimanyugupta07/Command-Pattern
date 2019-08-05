package com.hotels.bookclub.cmdpattern.items;

public class Stereo {
  private final String name;

  public Stereo(String name) {
    this.name = name;
  }

  public void on() {
    System.out.println(name + " Stereo is on.");
  }

  public void off() {
    System.out.println(name + " Stereo is off.");
  }
}
