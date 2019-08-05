package com.hotels.bookclub.cmdpattern.command.impl;

import com.hotels.bookclub.cmdpattern.command.Command;
import com.hotels.bookclub.cmdpattern.items.Fan;

public class FanOnCommand implements Command {

  private final Fan fan;

  public FanOnCommand(Fan fan) {
    this.fan = fan;
  }

  public void execute() {
    fan.on();
  }

  public void undo() {
    fan.off();

  }

}
