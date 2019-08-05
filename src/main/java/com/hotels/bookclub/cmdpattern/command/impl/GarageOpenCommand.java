package com.hotels.bookclub.cmdpattern.command.impl;

import com.hotels.bookclub.cmdpattern.command.Command;
import com.hotels.bookclub.cmdpattern.items.Garage;

public class GarageOpenCommand implements Command {

  private final Garage garage;

  public GarageOpenCommand(Garage garage) {
    this.garage = garage;
  }

  public void execute() {
    garage.open();
  }

  public void undo() {
    garage.close();
  }
}
