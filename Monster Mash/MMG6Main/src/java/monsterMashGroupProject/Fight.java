/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterMashGroupProject;

import databaseManagement.Monster;
import java.util.Random;

/**
 * @author Dan
 */
public class Fight {

    private Random rand = new Random();
    /**
     * Picks a winner and returns the winning monster.
     */
    public Monster determineWinner(Monster m1, Monster m2) {
        int m1Prob = randomizeProbabilities(compareAttributesRetM1(m1, m2));
        int randomPick = rand.nextInt(100);
        if (m1Prob >= randomPick) {
            return m1;
        } else {
            return m2;
        }
    }

    /**
     * +- 5% randomly from the probabilities so long as the lower probability is greater than 5.
     */
    public int randomizeProbabilities(int m1Prob) {
        if ((m1Prob > 5) || (m1Prob < 95)) {
            int random = rand.nextInt(6) - 5;
            return (m1Prob + random);
        } else {
            return m1Prob;
        }
    }

    /**
     * Percentage (out of 100) determining who is most likely to win based on monster statistics, including age.
     */
    public int compareAttributesRetM1(Monster m1, Monster m2) {
        int[] stats1 = new int[2];
        int[] stats2 = new int[2];
        int[] finalStats = new int[2];
        int total;
        int m1Prob;

        stats1[0] = ((m1.getAggression() * Worth.assessAge(m1)) / 10);
        stats1[1] = ((m1.getStrength() * Worth.assessAge(m1)) / 10);
        stats2[0] = ((m2.getAggression() * Worth.assessAge(m2)) / 10);
        stats2[1] = ((m2.getStrength() * Worth.assessAge(m2)) / 10);

        finalStats[0] = (stats1[0] + stats1[1]);
        finalStats[1] = (stats2[0] + stats2[1]);
        total = (finalStats[0] + finalStats[1]);

        m1Prob = (int) Math.round((finalStats[0] * 100.0) / total);
        return m1Prob;
    }


}
