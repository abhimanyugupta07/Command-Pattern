package com.hotels.bookclub.cmdpattern.command;

public interface Command {
  public void execute();

  public void undo();
}
