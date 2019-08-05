package com.hotels.bookclub.cmdpattern.command;

import com.hotels.bookclub.cmdpattern.command.impl.EmptyCommand;

public class CmdPatternRemoteControl {
  private final Command[] onCommands;
  private final Command[] offCommands;

  private Command lastCommand;

  public CmdPatternRemoteControl() {
    int size = 8;
    Command emptyCommand = new EmptyCommand();
    lastCommand = emptyCommand;

    onCommands = new Command[size];
    offCommands = new Command[size];

    for (int i = 0; i < size; i++) {
      onCommands[i] = emptyCommand;
      offCommands[i] = emptyCommand;
    }
  }

  public void setCommand(int key, Command onCommand, Command offCommand) {
    onCommands[key] = onCommand;
    offCommands[key] = offCommand;
  }

  public void onButtonIsPressed(int key) {
    onCommands[key].execute();
    lastCommand = onCommands[key];
  }

  public void offButtonIsPressed(int key) {
    offCommands[key].execute();
    lastCommand = offCommands[key];
  }

  public void undoButtonIsPressed() {
    lastCommand.undo();
  }

}
