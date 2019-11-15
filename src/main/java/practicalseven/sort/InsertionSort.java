/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    source Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package practicalseven.sort;

/**
 * An implementation of the InsertionSort sorting algorithm.
 *
 * @author Gregory M. Kapfhammer
 */

public class InsertionSort extends Sorter {

  /** Define the name of this sorting algorithm. */
  public InsertionSort() {
    name = "InsertionSort";
  }

  /** Insertion-sort of an array of chars into a nondecreasing order. This
   * implementation of the sort method makes a complete copy of the input array,
   * thus ensuring that it does not modify the input parameter.
   *
   * <p>Please refer to this site:
   * https://docs.oracle.com/javase/7/docs/api/java/lang/System.html
   * for more details about the System.arraycopy() method.
   *
   * @param source the source array that will be copied and sorted
   * @return the copied and sorted array in a nondecreasing order
   */
  public char[] sort(char[] source) {
    int length = source.length;
    char[] sorted = new char[source.length];
    System.arraycopy(source, 0, sorted, 0, source.length);
    for (int i = 1; i < length; i++) {
      char currentValue = sorted[i];
      int start = i;
      while (start > 0 && sorted[start - 1] > currentValue) {
        sorted[start] = sorted[start - 1];
        start--;
      }
      sorted[start] = currentValue;
    }
    return sorted;
  }

  /** Insertion-sort of an array of ints into a nondecreasing order. This
   * implementation of the sort method makes a complete copy of the input array,
   * thus ensuring that it does not modify the input parameter.
   *
   * <p>Please refer to this site:
   * https://docs.oracle.com/javase/7/docs/api/java/lang/System.html
   * for more details about the System.arraycopy() method.
   *
   * @param source the source array that will be copied and sorted
   * @return the copied and sorted array in a nondecreasing order
   */
  public int[] sort(int[] source) {
    int length = source.length;
    int[] sorted = new int[source.length];
    System.arraycopy(source, 0, sorted, 0, source.length);
    for (int i = 1; i < length; i++) {
      int currentValue = sorted[i];
      int start = i;
      while (start > 0 && sorted[start - 1] > currentValue) {
        sorted[start] = sorted[start - 1];
        start--;
      }
      sorted[start] = currentValue;
    }
    return sorted;
  }

  /** Demonstrate the use of the InsertionSort algorithm. */
  public static void main(String[] args) {
    char[] letters = {'C', 'E', 'B', 'D', 'A', 'I', 'J', 'L', 'K', 'H', 'G', 'F'};
    System.out.println("Before: " + java.util.Arrays.toString(letters));
    char[] sortedLetters = (new InsertionSort()).sort(letters);
    System.out.println("After : " + java.util.Arrays.toString(sortedLetters));
    int[] numbers = {1, 2, 4, 4, 9, 10, -10, 3, 8, 7, 20, 0};
    System.out.println("Before: " + java.util.Arrays.toString(numbers));
    int[] sortedNumbers = (new InsertionSort()).sort(numbers);
    System.out.println("After : " + java.util.Arrays.toString(sortedNumbers));
  }
}
