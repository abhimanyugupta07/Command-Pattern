package com.hotels.bookclub.cmdpattern.command.impl;

import com.hotels.bookclub.cmdpattern.command.Command;
import com.hotels.bookclub.cmdpattern.items.Light;

public class LightOnCommand implements Command {

  private final Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.turnOn();
  }

  public void undo() {
    light.turnOff();
  }

}
