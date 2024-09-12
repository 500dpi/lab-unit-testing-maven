package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;


public class TestExpMethod {

  @Test
  public void testExp() {
    int expected = 1;
    for (int i = 0; i < 5;) { 
      expected = 2 * expected;
      assertEquals(expected, SampleMethods.expt(2, i));
      i++;
    }
  }
}
