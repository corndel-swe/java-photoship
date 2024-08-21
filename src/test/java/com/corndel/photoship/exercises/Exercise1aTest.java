 package com.corndel.photoship.exercises;
 import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class Exercise1aTest {

  //should return the sum of the first and last elements in a multi-element array
  @Test
  void testName() {
    assertEquals(firstAddLast(new int[] {4, 1, 9, 5, 2}), 6);
  }

  //should handle negative numbers correctly
  @Test
  void testName() {
    assertEquals(firstAddLast(new int[] {-3, 1, 4, -2}), -5);
  }
}
