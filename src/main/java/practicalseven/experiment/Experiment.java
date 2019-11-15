package practicalseven.experiment;

import practicalseven.data.ResultsTable;
import practicalseven.sort.BubbleSort;
import practicalseven.sort.InsertionSort;
import practicalseven.sort.QuickSort;
import practicalseven.sort.Sorter;

/**
 * An Experiment class that can run a campaign of experiments.
 *
 * @author Gregory M. Kapfhammer
 */

public class Experiment {

  /** Run a Sorter in an experiment campaign. */
  public static void main(String[] args) {
    RunCampaign runSorterCampaign = new RunCampaign();
    // Create a BubbleSort and run it in a campaign
    BubbleSort bubbleSort = new BubbleSort();
    ResultsTable bubbleSortResultsTable = runSorterCampaign.run(bubbleSort);
    System.out.println();
    System.out.println("Results of an experiment campaign with " + bubbleSort.getName() + ":\n");
    System.out.println(bubbleSortResultsTable.toString());
    System.out.println();
    // Create an InsertionSort and run it in a campaign
    InsertionSort insertionSort = new InsertionSort();
    ResultsTable insertionSortResultsTable = runSorterCampaign.run(insertionSort);
    System.out.println();
    System.out.println("Results of an experiment campaign with " + insertionSort.getName() + ":\n");
    System.out.println(insertionSortResultsTable.toString());
    System.out.println();
    // Create a QuickSort and run it in a campaign
    QuickSort quickSort = new QuickSort();
    ResultsTable quickSortResultsTable = runSorterCampaign.run(quickSort);
    System.out.println();
    System.out.println("Results of an experiment campaign with " + quickSort.getName() + ":\n");
    System.out.println(quickSortResultsTable.toString());
  }

}
