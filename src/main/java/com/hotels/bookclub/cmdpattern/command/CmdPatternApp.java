package com.hotels.bookclub.cmdpattern.command;

import com.hotels.bookclub.cmdpattern.command.impl.FanOffCommand;
import com.hotels.bookclub.cmdpattern.command.impl.FanOnCommand;
import com.hotels.bookclub.cmdpattern.command.impl.GarageCloseCommand;
import com.hotels.bookclub.cmdpattern.command.impl.GarageOpenCommand;
import com.hotels.bookclub.cmdpattern.command.impl.LightOffCommand;
import com.hotels.bookclub.cmdpattern.command.impl.LightOnCommand;
import com.hotels.bookclub.cmdpattern.command.impl.MacroCommand;
import com.hotels.bookclub.cmdpattern.command.impl.StereoOffCommand;
import com.hotels.bookclub.cmdpattern.command.impl.StereoOnCommand;
import com.hotels.bookclub.cmdpattern.items.Fan;
import com.hotels.bookclub.cmdpattern.items.Garage;
import com.hotels.bookclub.cmdpattern.items.Light;
import com.hotels.bookclub.cmdpattern.items.Stereo;

public class CmdPatternApp {
  public static void main(String[] args) {
    CmdPatternRemoteControl rc = new CmdPatternRemoteControl();

    Light light = new Light("Kitchen");
    Fan fan = new Fan("Living Room");
    Garage garage = new Garage("One");
    Stereo stereo = new Stereo("Living room");

    Command lightOnCommand = new LightOnCommand(light);
    Command lightOffCommand = new LightOffCommand(light);

    Command garageOpenCommand = new GarageOpenCommand(garage);
    Command garageCloseCommand = new GarageCloseCommand(garage);

    Command fanOnCommand = new FanOnCommand(fan);
    Command fanOffCommand = new FanOffCommand(fan);

    Command stereoOnCommand = new StereoOnCommand(stereo);
    Command stereoOffCommand = new StereoOffCommand(stereo);

    Command[] partyOnCommands = { lightOnCommand, fanOnCommand, stereoOnCommand };
    Command[] partyOffCommands = { lightOffCommand, fanOffCommand, stereoOffCommand };

    Command macroOnCommand = new MacroCommand(partyOnCommands);
    Command macroOffCommand = new MacroCommand(partyOffCommands);

    rc.setCommand(0, lightOnCommand, lightOffCommand);
    rc.setCommand(1, garageOpenCommand, garageCloseCommand);
    rc.setCommand(2, fanOnCommand, fanOffCommand);

    rc.setCommand(3, macroOnCommand, macroOffCommand);

    rc.onButtonIsPressed(0);

    rc.undoButtonIsPressed();

    rc.offButtonIsPressed(1);
    rc.onButtonIsPressed(2);

    rc.onButtonIsPressed(7);

    System.out.println("\n\nPARTY ON...");
    rc.onButtonIsPressed(3);

    System.out.println("\n\nPARTY OFF...");
    rc.undoButtonIsPressed();

  }
}
