package com.corndel.photoship.exercises;

public class Exercise2b {
  // https://tech-docs.corndel.com/js/array-map.html

  /**
   * An array of numbers representing filesize in KB is passed in. The filesizes should be converted
   * to MB. Assume that 1MB = 1000KB.
   *
   * <p>e.g. [1400, 500, 2100] => [1.4, 0.5, 2.1]
   *
   * @param {number[]} arr - An array of KB
   * @returns {Array} The array in MB
   */
  public static double[] convertFilesizes(double[] arr) {
    // // TODO
    // return new double[] {};
    double[] result = new double[arr.length];

    for (int i = 0; i < arr.length; i++) {
      result[i] = arr[i] / 1000.0;
    }

    return result;
  }
}
