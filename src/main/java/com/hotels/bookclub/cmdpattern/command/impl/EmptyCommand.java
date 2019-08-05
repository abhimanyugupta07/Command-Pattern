package com.hotels.bookclub.cmdpattern.command.impl;

import com.hotels.bookclub.cmdpattern.command.Command;

public class EmptyCommand implements Command {

  public void execute() {
    System.out.println("I am not mapped to anything !");
  }

  public void undo() {}

}
