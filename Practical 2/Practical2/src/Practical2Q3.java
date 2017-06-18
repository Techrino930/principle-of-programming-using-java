/**
 * Created by techrino on 03/04/2017.
 */

import java.util.*;

public class Practical2Q3 {
    public static void main(String[] args) {
        double meter, calculation;
        System.out.print("Enter a value for meter: ");
        Scanner input = new Scanner(System.in);
        meter = input.nextDouble();
        calculation = meter * 3.2786;

        System.out.println(String.format("%.1f", meter) + " meters is " + String.format("%.3f", calculation)+ " feet");

    }
}
