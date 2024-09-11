package com.corndel.photoship.exercises;

import static com.corndel.photoship.exercises.Exercise1b.arrayRotate;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Exercise1bTest {

  // puts the last element to the front
  @Test
  void rotates() {
    assertArrayEquals(
        arrayRotate(new ArrayList<String>(List.of("x", "y", "z"))).toArray(),
        new String[] { "z", "x", "y" });
  }

  // should swap the elements in a two-element array
  @Test
  void swaps() {
    assertArrayEquals(
        arrayRotate(new ArrayList<Integer>(List.of(1, 2))).toArray(), new Integer[] { 2, 1 });
  }
}
