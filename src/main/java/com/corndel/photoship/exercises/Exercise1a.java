package com.corndel.photoship.exercises;

public class Exercise1a {
  // Read https://tech-docs.corndel.com/js/arrays.html first!

  /**
   * Returns the sum of the first and last elements of the array.
   *
   * <p>e.g. [4, 1, 9, 5, 2] => 6
   *
   * @param {number[]} nums - An array of numbers.
   * @returns {number} The sum of the first and last elements.
   */
  public static int firstAddLast(int[] nums) {
    // // TODO
    // return 0;

    // TODO remove solution
    var last = nums.length - 1;
    return nums[0] + nums[last];
  }
}
