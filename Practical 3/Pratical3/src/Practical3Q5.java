/**
 * Created by techrino on 11/04/2017.
 */

import java.util.*;

public class Practical3Q5 {

    public static void main(String[] args) {
        int month;
        System.out.print("Please enter a month: ");

        Scanner input = new Scanner(System.in);

        month = input.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");

                break;
            case 6:
                System.out.println("June");

                break;

            case 7:
                System.out.println("July");

                break;

            case 8:
                System.out.println("August");

                break;

            case 9:
                System.out.println("September");

                break;

            case 10:
                System.out.println("October");

                break;

            case 11:
                System.out.println("November");

                break;

            case 12:
                System.out.println("December");

                break;
            default:
                System.out.println("Invalid Input");

                break;
        }

    }
}
