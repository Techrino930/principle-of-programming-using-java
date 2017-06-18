import java.util.Scanner;

/**
 * Created by Lee Li Wei on 5/19/2017.
 */


public class Q2 {

    public static void main(String[] args){
        System.out.println("a.");
        Scanner input = new Scanner(System.in);
        int number = 0;
        int maxNum = 0 , minNum = 0 , numberDigit = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        while(number > 0){
            numberDigit = number % 10;
            if(numberDigit >= maxNum){
                maxNum = numberDigit;
            }else {
                minNum = numberDigit;
            }
            number /=10;
        }
        System.out.println("Minimum number is: " + minNum);
        System.out.println("Maximum number is: " + maxNum);

        System.out.println("b.");
        System.out.print("Please Enter a number: ");
        int bNumber  = 0 , bNumberDigit= 0, sumEven = 0, sumOdd = 0;
        bNumber = input.nextInt();

        while (bNumber > 0 ){
            bNumberDigit = bNumber /=10;

            if(bNumberDigit % 2 ==0){
                sumEven ++;
            } else {
                sumOdd++;
            }
        }
        System.out.println("Total numbers of Even digit is : " + sumEven);
        System.out.println("Total numbers of Odd digit is : " + sumOdd);


    }
}
