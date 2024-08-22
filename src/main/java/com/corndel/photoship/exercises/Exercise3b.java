package com.corndel.photoship.exercises;

public class Exercise3b {
  // https://tech-docs.corndel.com/js/string-formatting.html

  /**
   * Formats the amount as a price, with the given currency symbol at the front
   *
   * <p>e.g. (2.5, "$") => "$2.50" e.g. (12.83795, "£") => "£12.84"
   *
   * @param {number} amount - The amount of money
   * @param {string} currency - The currency symbol
   * @returns {string} currency The formatted number
   */
  public static String formatPrice(double amount, String currency) {
    // // TODO
    // return "TODO";

    return String.format("%s%.2f", currency, amount);
  }
}
