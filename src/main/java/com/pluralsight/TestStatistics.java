package com.pluralsight;

public class TestStatistics {

    public static void main(String[] args) {

        //Create an array of 10 test scores
        int[] Scores = {60, 80, 78, 69, 92, 87, 71, 91, 66, 75};

        // Print out average, high score, low score

        double avgScore = 0;
        int scoreSum = 0;

        for (int i = 0; i < Scores.length; i++) {
            scoreSum += Scores[i];
        }

        avgScore = scoreSum / Scores.length;
        System.out.println("The average is: " + avgScore);

        int max = Scores[0];
        for ( int i = 0; i < Scores.length; i ++) {
            max = Scores[i];
        }
        System.out.println("The highest Score is: " + max);

        int min = Scores[0];
        for (int i = 0; i < Scores.length; i++) {
            min = Scores[i];
        }
        System.out.println("The lowest Score is: " + min);
    }
}
