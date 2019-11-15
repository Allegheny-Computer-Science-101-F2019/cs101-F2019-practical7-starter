package practicalseven.sort;

import java.util.Arrays;

/**
 * A wrapper class to call a Dual-Pivot Quicksort provided by Arrays.
 *
 * @author Gregory M. Kapfhammer
 */

public class QuickSort extends Sorter {

  /** Define the name of this sorting algorithm. */
  public QuickSort() {
    name = "QuickSort";
  }

  /** QuickSort sort of a provided char[] array.
   *
   * <p>Please refer to this site:
   * https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#sort(char[])
   * for more details about how this method works.
   *
   * @param source the source array that will be copied and sorted
   * @return the copied and sorted array in a nondecreasing order
   */
  public char[] sort(char[] source) {
    int length = source.length;
    char[] sorted = new char[source.length];
    // TODO: perform an arraycopy from the source to the sorted arrays
    // TODO: call the built-in sorting method that leverages QuickSort
    return sorted;
  }

  /** QuickSort sort of a provided int[] array.
   *
   * <p>Please refer to this site:
   * https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#sort(int[])
   * for more details about how this method works.
   *
   * @param source the source array that will be copied and sorted
   * @return the copied and sorted array in a nondecreasing order
   */
  public int[] sort(int[] source) {
    int length = source.length;
    int[] sorted = new int[source.length];
    // TODO: perform an arraycopy from the source to the sorted arrays
    // TODO: call the built-in sorting method that leverages QuickSort
    return sorted;
  }

  /** Demonstrate the use of the QuickSort algorithm. */
  public static void main(String[] args) {
    char[] letters = {'C', 'E', 'B', 'D', 'A', 'I', 'J', 'L', 'K', 'H', 'G', 'F'};
    System.out.println("Before: " + java.util.Arrays.toString(letters));
    char[] sortedLetters = (new QuickSort()).sort(letters);
    System.out.println("After : " + java.util.Arrays.toString(sortedLetters));
    int[] numbers = {1, 2, 4, 4, 9, 10, -10, 3, 8, 7, 20, 0};
    System.out.println("Before: " + java.util.Arrays.toString(numbers));
    int[] sortedNumbers = (new QuickSort()).sort(numbers);
    System.out.println("After : " + java.util.Arrays.toString(sortedNumbers));
  }

}
