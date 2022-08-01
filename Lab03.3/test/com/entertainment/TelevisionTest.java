package com.entertainment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {

  public static final int INITIAL_VOLUME = 50;
  private Television television;


  @Before
  public void setUp() throws Exception {
    television =  new Television("Sony", INITIAL_VOLUME, DisplayType.OLED);
  }

  @Test
  public void getBrand() {
    fail("not yet implemented");

  }

  @Test
  public void setBrand() {
    fail("not yet implemented");

  }

  @Test
  public void getVolume() {
    assertEquals(INITIAL_VOLUME, television.getVolume());
  }

  @Test
  public void setVolumeValid() {   //OR setVolume_valid
    television.setVolume(Television.MIN_VOLUME +1);
    assertEquals(Television.MIN_VOLUME + 1, television.getVolume());
  }

  @Test(expected = IllegalArgumentException.class)
  public void setVolumeInvalid() {      //OR setVolume_invalid
    television.setVolume(Television.MIN_VOLUME -1);

  }

  @Test
  public void getCurrentChannel() {
    fail("not yet implemented");
  }


  @Test
  public void changeChannel() {
    fail("not yet implemented");

  }

  @Test
  public void getDisplay() {
    fail("not yet implemented");

  }

  @Test
  public void setDisplay() {
    fail("not yet implemented");

  }

  @Test
  public void compareTo() {
    fail("not yet implemented");

  }

  @Test
  public void testHashCode() {
    fail("not yet implemented");

  }

  @Test
  public void testEquals() {
    fail("not yet implemented");

  }
}