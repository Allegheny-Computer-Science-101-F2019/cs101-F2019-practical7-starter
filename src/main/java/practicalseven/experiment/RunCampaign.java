package practicalseven.experiment;

import practicalseven.data.ResultsTable;
import practicalseven.sort.Sorter;

import java.util.Random;

/**
 * A RunCampaign class that can run an experiment with a Sorter.
 *
 * @author Gregory M. Kapfhammer
 */

public class RunCampaign implements Campaign {

  /** The starting size for running an experiment campaign. */
  private static final int INPUT_SIZE_START = 250;

  /** The growth factor for input when running an experiment campaign. */
  private static final int INPUT_GROWTH_FACTOR = 2;

  /** The total number of input size doubles to perform for an experiment campaign. */
  private static final int CAMPAIGN_LENGTH = 8;

  /** The indentation level for the output. */
  private static final String IDENTATION = "  ";

  /** Randomly generate data to use for an experiment. */
  public int[] generateRandomData(int size) {
    Random random = new Random();
    int[] generated = new int[size];
    for (int i = 0; i < generated.length; i++) {
      generated[i] = random.nextInt();
    }
    return generated;
  }

  /** Run a Sorter in an experiment campaign. */
  public ResultsTable run(Sorter sort) {
    int campaignRound = 0;
    int currentInputSize = INPUT_SIZE_START;
    ResultsTable results = new ResultsTable(CAMPAIGN_LENGTH);
    System.out.println("Starting a campaign of experiments with " + sort.getName() + " ...");
    // iteratively perform all of the experiment
    while (campaignRound < CAMPAIGN_LENGTH) {
      int[] generatedInput = generateRandomData(currentInputSize);
      long timeBefore = System.currentTimeMillis();
      sort.sort(generatedInput);
      long timeAfter = System.currentTimeMillis();
      long timeElapsed = timeAfter - timeBefore;
      results.addResult((long)currentInputSize, timeElapsed);
      System.out.println(IDENTATION + "Running round " + campaignRound
          + " with input size " + currentInputSize);
      currentInputSize = currentInputSize * INPUT_GROWTH_FACTOR;
      campaignRound++;
    }
    System.out.println("... Finishing a campaign of experiments with " + sort.getName());
    return results;
  }

}
