import java.util.*;
public class Practical3Q1 {

    public static void main(String[] args) {
        double hourlyRate, numberOfHour, grossPay, withHoldingPercentage, netPay,tax;
        System.out.print("Enter your hourly rate of pay: ");
        Scanner input = new Scanner(System.in);
        hourlyRate  = input.nextDouble();
        System.out.print("Enter the number of the working hours: ");
        numberOfHour = input.nextDouble();

        grossPay = numberOfHour * hourlyRate;

        if(grossPay <= 500){

            withHoldingPercentage = 0.1;
            tax = (grossPay * withHoldingPercentage);
            netPay = grossPay + tax;
            System.out.println("Your Tax is " + tax);
            System.out.println("Your net pay is " + netPay);
        } else if(grossPay >= 500.1 && grossPay <=1000){
            withHoldingPercentage = 0.12;
            tax = (grossPay * withHoldingPercentage);
            netPay = grossPay + tax;

            System.out.println("Your Tax is " + tax);

            System.out.println("Your net pay is " + netPay);

        } else {
            withHoldingPercentage = 0.15;
            tax = (grossPay * withHoldingPercentage);
            netPay = grossPay + tax;
            System.out.println("Your Tax is " + tax);


            System.out.println("Your net pay is " + netPay);
        }


    }
}
