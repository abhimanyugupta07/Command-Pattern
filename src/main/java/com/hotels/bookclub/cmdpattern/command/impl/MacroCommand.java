package com.hotels.bookclub.cmdpattern.command.impl;

import com.hotels.bookclub.cmdpattern.command.Command;

public class MacroCommand implements Command {

  private final Command[] commands;

  public MacroCommand(Command[] commands) {
    this.commands = commands;
  }

  public void execute() {
    for (int i = 0; i < commands.length; i++) {
      commands[i].execute();
    }

  }

  public void undo() {
    for (int i = 0; i < commands.length; i++) {
      commands[i].undo();
    }

  }

}
