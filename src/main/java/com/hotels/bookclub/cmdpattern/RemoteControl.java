package com.hotels.bookclub.cmdpattern;

import com.hotels.bookclub.cmdpattern.items.Fan;
import com.hotels.bookclub.cmdpattern.items.Garage;
import com.hotels.bookclub.cmdpattern.items.Light;
import com.hotels.bookclub.cmdpattern.items.Stereo;
import com.hotels.bookclub.cmdpattern.items.Tv;

public class RemoteControl {

  private final Object[] onObjects;
  private final Object[] offObjects;

  public RemoteControl() {
    int size = 8;

    onObjects = new Object[size];
    offObjects = new Object[size];

    for (int i = 0; i < 8; i++) {
      onObjects[i] = new Object();
      offObjects[i] = new Object();
    }
  }

  public void setKey(int key, Object object) {
    onObjects[key] = object;
    offObjects[key] = object;
  }

  public void onButtonIsPressed(int slot) {
    Object object = onObjects[slot];
    execute(object, true);
  }

  public void offButtonIsPressed(int slot) {
    Object object = offObjects[slot];
    execute(object, false);
  }

  public void execute(Object obj, boolean onCommand) {
    ItemType type = ItemType.forClass(obj.getClass());

    switch (type) {
    case FAN:
      Fan f = (Fan) obj;
      if (onCommand) {
        f.on();
      } else {
        f.off();
      }
      break;
    case LIGHT:
      Light light = (Light) obj;
      if (onCommand) {
        light.turnOn();
      } else {
        light.turnOff();
      }
      break;
    case STEREO:
      Stereo stereo = (Stereo) obj;
      if (onCommand) {
        stereo.on();
      } else {
        stereo.off();
      }
      break;
    case GARAGE:
      Garage garage = (Garage) obj;
      if (onCommand) {
        garage.open();
      } else {
        garage.close();
      }
      break;
    case TV:
      Tv tv = (Tv) obj;
      if (onCommand) {
        tv.on();
      } else {
        tv.off();
      }
      break;
    default:
      System.out.println("This item is not controlled by the Remote");
      break;
    }

  }

}
