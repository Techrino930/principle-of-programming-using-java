/**
 * Created by Lee Li Wei on 5/15/2017.
 */

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score (negative number to end)");
        double[] score = new double[10];
        double sum = 0;
        int counter = 0;
        double mark = 0.0;
        do {
            System.out.print("Score " + (counter + 1) + ": ");
         mark = input.nextDouble();
            score[counter] = mark;
            if (mark > 0) {
                sum += score[counter];
                counter++;
            }
        } while (mark >= 0 && counter != score.length);
        double average = (sum / counter);
        System.out.println("Results");
        System.out.println("=======");
        System.out.println("Average is " + average);

        int aboveAverage = 0;
        int belowAverage = 0;
        int i = 0;
        while(i < counter){
            if(score[i] >= average ){
                aboveAverage ++;
            }
            if(score[i] < average){
                belowAverage ++;
            }

            i++;
        }
        System.out.println("Number of scores above or equal to the average is " + aboveAverage);
        System.out.println("Number of scores below the average is "+ belowAverage);
    }
}
