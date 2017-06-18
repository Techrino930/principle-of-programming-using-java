/**
 * Created by techrino on 03/04/2017.
 */

import java.util.*;

public class Practical2Q1 {

    public static void main(String[] args) {

        double miles = 0;
        double result = 0;
        System.out.print("Enter miles: ");
        Scanner input = new Scanner(System.in);
        miles = input.nextDouble();
        // 1 mile = 1.61km
        result = miles * 1.6;

        System.out.println((int) miles + " miles is " + String.format("%.2f" , result) + " kilometers");
    }


}
