package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Tests of the sample methods.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class TestSampleMethods {
  /**
   * A test that should succeed.
   */
  @Test
  public void test2() {
        assertEquals(10, 3*5, "stupid test");
  } // test2()

  @Test
  void sampleSuccesfulTest() {
    assertEquals(2, 2);
  } // sampleSuccessfulTest()

  /**
   * A test that should fail.
   */
  @Test
  void sampleFailingTest() {
    assertEquals(2, 3);
  } // sampleFailingTest()

  @Test
  void celsiustoF() {
    assertEquals(32, SampleMethods.c2f(0));
  }

  @Test 
  void celsiustoFlarge() {
    assertEquals(212, SampleMethods.c2f(100));
  }

  @Test
  void celsiustiFneg() {
    assertEquals(-148, SampleMethods.c2f(-100));
  }

  @Test
  void sumtest(){
    int[] values = { 1, 2, 3 };
    assertEquals(6, SampleMethods.sum(values));
  }

  @Test
  void sumtestneg(){
    int[] values = { -1, -2, -3 };
    assertEquals(-6, SampleMethods.sum(values));
  }

  @Test
  void sumtestzero(){
    int[] values = { 0, 0, 0 };
    assertEquals(0, SampleMethods.sum(values));
  }

    @Test
  public void testExtremes() {
    int tmp = Integer.MAX_VALUE - 10;
    int[] values = { tmp, tmp, -tmp, -tmp };
    assertEquals(0, SampleMethods.sum(values), "extreme values");
 } // testExtremes

} // class TestSampleMethods
