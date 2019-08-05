package com.hotels.bookclub.cmdpattern.command.impl;

import com.hotels.bookclub.cmdpattern.command.Command;
import com.hotels.bookclub.cmdpattern.items.Stereo;

public class StereoOffCommand implements Command {

  private final Stereo stereo;

  public StereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  public void execute() {
    stereo.off();
  }

  public void undo() {
    stereo.on();
  }
}
