/**
 * Created by techrino on 03/04/2017.
 */

import java.util.*;

public class Practical2Q2 {
    public static void main(String[] args) {
        double area, lengthOfSides, volume;

        System.out.println("Enter length of the sides and height of the Equilateral");
        System.out.print("triangle: ");

        Scanner input = new Scanner(System.in);
        lengthOfSides = input.nextFloat();
        area = ((Math.sqrt(3))/4)  * (Math.pow(lengthOfSides, 2));
        volume = area * lengthOfSides;

        System.out.println("The area is " + String.format("%.2f", area));
        System.out.println("The volume of the Triangular prism is " + String.format("%.2f", volume));

    }
}
