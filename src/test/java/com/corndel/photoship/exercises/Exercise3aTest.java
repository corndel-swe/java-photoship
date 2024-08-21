 package com.corndel.photoship.exercises;
 import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class Exercise3aTest {

  //should return a greeting with the name in uppercase
  @Test
  void testName() {
    assertEquals(nameTag("abdi"), "Hello, my name is ABDI!");
  }

  //should handle names already in uppercase
  @Test
  void testName() {
    assertEquals(nameTag("ALICE"), "Hello, my name is ALICE!");
  }

  //should handle names with mixed case
  @Test
  void testName() {
    assertEquals(nameTag("eLiZaBeTh"), "Hello, my name is ELIZABETH!");
  }

  //should handle single-character names
  @Test
  void testName() {
    assertEquals(nameTag("b"), "Hello, my name is B!");
  }
}
