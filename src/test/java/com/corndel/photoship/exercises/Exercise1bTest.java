 package com.corndel.photoship.exercises;
 import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class Exercise1bTest {

  //should return middle elements of a multi-element array
  @Test
  void testName() {
    assertArrayEquals(getMiddle(new int[] {4, 6, 1, 7, 9}), new int[] {6, 1, 7});
  }

  //should return a single middle element for an array of three elements
  @Test
  void testName() {
    assertArrayEquals(getMiddle(new int[] {2, 3, 4}), new int[] {3});
  }

  //should return an empty array for a two-element array
  @Test
  void testName() {
    assertArrayEquals(getMiddle(new int[] {1, 2}), new int[] {});
  }
}
