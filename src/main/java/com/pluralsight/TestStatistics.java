package com.pluralsight;

import java.util.Arrays;

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

        // BONUS: Calculate and display the median value

        // order the array from least to highest
        Arrays.sort(Scores);
        // find the median
        //have an even number of elements in the array
        // TO find the median have to add the 2 in the middle and divide by 2
        double median;
        int middleIndex = Scores.length/2;
        if (Scores.length % 2 == 0) {
            // If even, average the two middle numbers
            median = (Scores[middleIndex - 1] + Scores[middleIndex]) / 2;
        } else {
            // If odd, take the middle number
            median = Scores[middleIndex];

            System.out.println("The median value is: " + middleIndex);
            //difference between average and median = median value
            double difference = avgScore - middleIndex;
            System.out.println("The difference between the average and the median is: " + difference);
    }
}}
