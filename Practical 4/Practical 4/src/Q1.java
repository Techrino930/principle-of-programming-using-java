import java.util.Scanner;

public class Q1 {

    public static void main(String[] args){
        System.out.println("A. sum of all even numbers between 2 and 100");
       int sum = 0;
        for(int counter = 2; counter <=100 ; counter+=2){
             sum += counter;
       }
       System.out.println("The sum of all even numbers between 2 and 100 is : " + sum);

        System.out.println("B. The sum of all squares between 1 and 100 (inclusive)");
        int counter2= 1;
        int sum2 = 0;
        while(counter2 <= 100){
            sum2 += Math.pow(counter2,2);

            counter2++;
        }
        System.out.println("The sum of all squares between 1 and 100 is : " + sum2);
        System.out.println("C.");
        Scanner input = new Scanner(System.in);
        int numberA = 0 ;
        int numberB = 0;
        System.out.print("Please Enter number A : ");
        numberA = input.nextInt();
        System.out.print("Please Enter number B : ");
        numberB = input.nextInt();
        int sumOdd = 0;
        while (numberA <= numberB){
            if(numberA % 2 != 0){
                sumOdd += numberA;
            }
            numberA ++;
        }
        System.out.println("The sum of all odd numbers between numberA and numberB is: " + sumOdd);
        System.out.print("D. Please key in a numbers : ");
        int number = 0;
        number = input.nextInt();
    int numberDigit = 0;
    int sumDigit = 0;
    while (number > 0){
        numberDigit = number % 10;

        if(numberDigit %2 == 1){
            sumDigit += numberDigit;
        }
        number /=10;
    }
    System.out.println("The sum of all odd digits on an input is : " + sumDigit);

    }
}
