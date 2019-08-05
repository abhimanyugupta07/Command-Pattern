package com.hotels.bookclub.cmdpattern.command.impl;

import com.hotels.bookclub.cmdpattern.command.Command;
import com.hotels.bookclub.cmdpattern.items.Light;

public class LightOffCommand implements Command {

  private final Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.turnOff();
  }

  public void undo() {
    light.turnOn();

  }

}
