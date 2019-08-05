package com.hotels.bookclub.cmdpattern;

import com.hotels.bookclub.cmdpattern.items.Fan;
import com.hotels.bookclub.cmdpattern.items.Garage;
import com.hotels.bookclub.cmdpattern.items.Light;

/**
 * App Without Command Pattern
 */
public class App {
  public static void main(String[] args) {
    RemoteControl rc = new RemoteControl();

    Fan fan = new Fan("Living Room");
    Garage garage = new Garage("One");
    Light light = new Light("Kitchen");

    rc.setKey(0, fan);
    rc.setKey(1, garage);
    rc.setKey(2, light);

    rc.onButtonIsPressed(1);
    rc.onButtonIsPressed(0);
    rc.onButtonIsPressed(2);

    rc.offButtonIsPressed(2);
    rc.offButtonIsPressed(1);

    rc.onButtonIsPressed(3);
  }
}
