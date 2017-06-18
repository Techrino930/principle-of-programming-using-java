
/**
 * Created by techrino on 03/04/2017.
 */

import java.util.Scanner;

public class Practical2Q4 {
    public static void main(String[] args) {
        double gratuityRate, gratuity, subtotal, total;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and gratuity rate: ");
        subtotal = input.nextDouble();
        gratuity = input.nextDouble();

        gratuityRate = subtotal * (gratuity / 100);
        total = gratuityRate + subtotal;
        System.out.println("The gratuity is $" + String.format("%.2f", gratuityRate) + " and total is $" + String.format("%.2f", total));
    }
}
