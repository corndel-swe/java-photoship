package com.corndel.photoship.exercises;

public class Exercise3a {
  // https://tech-docs.corndel.com/js/string-formatting.html

  /**
   * Outputs a string saying "Hello, my name is NAME!" with the name in uppercase.
   *
   * <p>e.g. ("Abdi") => "Hello, my name is ABDI!"
   *
   * @param {string} name - The name
   * @returns {string} The greeting string with uppercase name interpolated
   */
  public static String nameTag(String name) {
    // // TODO
    // return "TODO";

    return String.format("Hello, my name is %s!", name.toUpperCase());
  }
}
