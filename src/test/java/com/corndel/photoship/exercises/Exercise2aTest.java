 package com.corndel.photoship.exercises;
 import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class Exercise2aTest {

  //puts the last element to the front
  @Test
  void testName() {
    assertArrayEquals(arrayRotate(new int[] {"x", "y", "z"}), new int[] {"z", "x", "y"});
  }

  //should swap the elements in a two-element array
  @Test
  void testName() {
    assertArrayEquals(arrayRotate(new int[] {1, 2}), new int[] {2, 1});
  }

  //should correctly rotate elements in an array with mixed types
  @Test
  void testName() {
    assertArrayEquals(arrayRotate(new int[] {1, "a", true}), new int[] {true, 1, "a"});
  }
}
