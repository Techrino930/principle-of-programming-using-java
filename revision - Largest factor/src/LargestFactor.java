/**
 * Created by Lee Li Wei on 6/19/2017.
 */
import java.util.Scanner;
public class LargestFactor {
    public static void main(String[] args){
        System.out.print("Enter an Integer: ");
        Scanner input = new Scanner(System.in);
        int n  = input.nextInt();
    int a = 2;
    int largestFactor = 0;
        while (a < n){
            if(n % a ==0){
                largestFactor = a;

            }

            a++;
        }

        System.out.println("The largest factor for " + n + " is " + largestFactor);
    }
}
