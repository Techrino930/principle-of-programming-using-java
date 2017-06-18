import java.util.Scanner;

/**
 * Created by Lee Li Wei on 5/20/2017.
 */
public class Q1 {
    public static int mulDigits(long n){
        long numDigit = 0 , result = 0;
        if(n> 0){
            result = 1;
        } else {
            result = 0;
        }
        while(n > 0){
            numDigit = n % 10;

            result = result * numDigit;
            n /= 10;

        }
        return (int)result;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter an Integer: ");
        int number = input.nextInt();
        System.out.println("The multiplication for all of the digits are : " +  mulDigits(number));

    }
}
