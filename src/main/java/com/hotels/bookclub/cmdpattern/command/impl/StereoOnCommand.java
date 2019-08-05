package com.hotels.bookclub.cmdpattern.command.impl;

import com.hotels.bookclub.cmdpattern.command.Command;
import com.hotels.bookclub.cmdpattern.items.Stereo;

public class StereoOnCommand implements Command {

  private final Stereo stereo;

  public StereoOnCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  public void execute() {
    stereo.on();
  }

  public void undo() {
    stereo.off();
  }

}
