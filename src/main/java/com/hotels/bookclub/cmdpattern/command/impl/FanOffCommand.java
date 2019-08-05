package com.hotels.bookclub.cmdpattern.command.impl;

import com.hotels.bookclub.cmdpattern.command.Command;
import com.hotels.bookclub.cmdpattern.items.Fan;

public class FanOffCommand implements Command {

  private final Fan fan;

  public FanOffCommand(Fan fan) {
    this.fan = fan;
  }

  public void execute() {
    fan.off();
  }

  public void undo() {
    fan.on();

  }

}
