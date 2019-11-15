package practicalseven;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import practicalseven.sort.InsertionSort;

import java.util.Random;

/**
 * A JUnit test suite for the InsertionSort.
 *
 * @author Gregory M. Kapfhammer
 */

public class TestInsertionSort {

  /** The maximum number of items to use for testing. */
  private static int MAXIMUM_NUMBER_ITEMS = 100;

  /** The maximum number of items to use for testing. */
  private static int MAXIMUM_NUMBER_CHARS = 43;

  /** The size of the alphabet for character generation. */
  private static int ALPHABET_SIZE = 26;

  /** The starting character. */
  private static char STARTING_CHARACTER = 'a';

  /** A method to determine if an array is isSorted. */
  private boolean isSorted(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] > array[i + 1]) {
        return false;
      }
    }
    return true;
  }

  /** A method to determine if an array is isSorted. */
  private boolean isSorted(char[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] > array[i + 1]) {
        return false;
      }
    }
    return true;
  }

  /** A method to reverse an int[] array. */
  private static int[] reverse(int[] source) {
    int low = 0;
    int high = source.length - 1;
    int[] reversed = new int[source.length];
    System.arraycopy(source, 0, reversed, 0, source.length);
    while (low < high) {
      int temp = reversed[low];
      reversed[low++] = reversed[high];
      reversed[high--] = temp;
    }
    return reversed;
  }

  /** A method to reverse an char[] array. */
  private static char[] reverse(char[] source) {
    int low = 0;
    int high = source.length - 1;
    char[] reversed = new char[source.length];
    System.arraycopy(source, 0, reversed, 0, source.length);
    while (low < high) {
      char temp = reversed[low];
      reversed[low++] = reversed[high];
      reversed[high--] = temp;
    }
    return reversed;
  }

  @Test
  public void testisSortedCheckerWorksForSortedChar() {
    char[] letters = {'A', 'C', 'D'};
    assertTrue(isSorted(letters));
  }

  @Test
  public void testisSortedCheckerWorksForUnSortedChar() {
    char[] letters = {'A', 'D', 'C'};
    assertTrue(!isSorted(letters));
  }

  @Test
  public void testisSortedCheckerWorksForSortedInt() {
    int[] numbers = {1, 2, 3};
    assertTrue(isSorted(numbers));
  }

  @Test
  public void testisSortedCheckerWorksForUnSortedInt() {
    int[] numbers = {2, 1, 3};
    assertTrue(!isSorted(numbers));
  }

  @Test
  public void testInsertionSortCorrectName() {
    assertEquals((new InsertionSort()).getName(), "InsertionSort");
  }

  @Test
  public void testInsertionSortWithChar() {
    char[] letters = {'C', 'E', 'B', 'D', 'A', 'I', 'J', 'L', 'K', 'H', 'G', 'F'};
    char[] sortedLetters = (new InsertionSort()).sort(letters);
    assertTrue(!isSorted(letters));
    assertTrue(isSorted(sortedLetters));
  }

  @Test
  public void testInsertionSortWithInt() {
    int[] numbers = {1, 2, 4, 4, 9, 10, -10, 3, 8, 7, 20, 0};
    int[] sortedNumbers = (new InsertionSort()).sort(numbers);
    assertTrue(!isSorted(numbers));
    assertTrue(isSorted(sortedNumbers));
  }

  @Test
  public void testInsertionSortWithManyOrderedInts() {
    int[] originalArray = new int[MAXIMUM_NUMBER_ITEMS];
    for (int i = 0; i < originalArray.length; i++) {
      originalArray[i] = i;
    }
    int[] sortedArray = (new InsertionSort()).sort(originalArray);
    assertTrue(isSorted(originalArray));
    assertTrue(isSorted(sortedArray));
  }

  @Test
  public void testInsertionSortWithManyOrderedChar() {
    char[] originalArray = new char[MAXIMUM_NUMBER_CHARS];
    for (int i = 0; i < originalArray.length; i++) {
      originalArray[i] = (char)(i + '0');
    }
    char[] sortedArray = (new InsertionSort()).sort(originalArray);
    assertTrue(isSorted(originalArray));
    assertTrue(isSorted(sortedArray));
  }

  @Test
  public void testInsertionSortWithManyReversedInts() {
    int[] originalArray = new int[MAXIMUM_NUMBER_ITEMS];
    for (int i = 0; i < originalArray.length; i++) {
      originalArray[i] = i;
    }
    int[] reversedArray = reverse(originalArray);
    int[] sortedArray = (new InsertionSort()).sort(reversedArray);
    assertTrue(isSorted(originalArray));
    assertTrue(isSorted(sortedArray));
  }

  @Test
  public void testInsertionSortWithManyReversedChars() {
    char[] originalArray = new char[MAXIMUM_NUMBER_CHARS];
    for (int i = 0; i < originalArray.length; i++) {
      originalArray[i] = (char)(i + '0');
    }
    char[] reversedArray = reverse(originalArray);
    char[] sortedArray = (new InsertionSort()).sort(reversedArray);
    assertTrue(isSorted(originalArray));
    assertTrue(isSorted(sortedArray));
  }

  @Test
  public void testInsertionSortWithManyRandomInts() {
    Random random = new Random();
    int[] originalArray = new int[MAXIMUM_NUMBER_ITEMS];
    for (int i = 0; i < originalArray.length; i++) {
      originalArray[i] = random.nextInt();
    }
    int[] sortedArray = (new InsertionSort()).sort(originalArray);
    assertTrue(isSorted(sortedArray));
  }

  @Test
  public void testInsertionSortWithManyRandomChars() {
    Random random = new Random();
    char[] originalArray = new char[MAXIMUM_NUMBER_ITEMS];
    for (char i = 0; i < originalArray.length; i++) {
      char randomCharacter = (char)(random.nextInt(ALPHABET_SIZE) + STARTING_CHARACTER);
      originalArray[i] = randomCharacter;
    }
    char[] sortedArray = (new InsertionSort()).sort(originalArray);
    assertTrue(isSorted(sortedArray));
  }

}
