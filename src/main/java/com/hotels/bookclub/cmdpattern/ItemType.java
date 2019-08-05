package com.hotels.bookclub.cmdpattern;

import com.hotels.bookclub.cmdpattern.items.Fan;
import com.hotels.bookclub.cmdpattern.items.Garage;
import com.hotels.bookclub.cmdpattern.items.Light;
import com.hotels.bookclub.cmdpattern.items.Stereo;
import com.hotels.bookclub.cmdpattern.items.Tv;

public enum ItemType {
  FAN(Fan.class),
  LIGHT(Light.class),
  STEREO(Stereo.class),
  GARAGE(Garage.class),
  TV(Tv.class),
  NOT_ASSIGNED(Object.class);

  private final Class<?> itemClass;

  private ItemType(Class<?> itemClass) {
    if (itemClass == null) {
      throw new NullPointerException("Parameter itemClass is required");
    }
    this.itemClass = itemClass;
  }

  public Class<?> itemClass() {
    return itemClass;
  }

  public static ItemType forClass(Class<?> clazz) {
    for (ItemType e : values()) {
      if (e.itemClass().equals(clazz)) {
        return e;
      }
    }
    throw new IllegalArgumentException("ItemType not found for class " + clazz.getName());
  }

}
