/**
 * Created by Lee Li Wei on 5/25/2017.
 */
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
        System.out.print("Please Enter today's price for one dollar in Japanese yen: ");
        Scanner input = new Scanner(System.in);
        double yen = input.nextDouble();
        double userInput;
        do {
        System.out.print("Enter your price in USD ");
        userInput = input.nextDouble();
        System.out.println("Yen :" + userInput * yen);
        } while(userInput != 0);
    }
}
