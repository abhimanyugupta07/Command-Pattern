package com.hotels.bookclub.cmdpattern.command.impl;

import com.hotels.bookclub.cmdpattern.command.Command;
import com.hotels.bookclub.cmdpattern.items.Garage;

public class GarageCloseCommand implements Command {

  private final Garage garage;

  public GarageCloseCommand(Garage garage) {
    this.garage = garage;
  }

  public void execute() {
    garage.close();
  }

  public void undo() {
    garage.open();

  }
}
