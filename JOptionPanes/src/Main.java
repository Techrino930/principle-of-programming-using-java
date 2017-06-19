import javax.swing.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {

//    String inputdialog1 = JOptionPane.showInputDialog("Enter Your Name:");
//    String inputdialog2 = JOptionPane.showInputDialog("Enter Your Birthyear:");
//
//    JOptionPane.showMessageDialog(null , inputdialog1  , "dew", JOptionPane.INFORMATION_MESSAGE);
//
//        char letter = 'A';
//        char numChar = '4';
//        System.out.println("Letter" + letter);
//        System.out.println("Number Char" + numChar);
//
//        System.out.println("\u6B22 \u8FCE");
//
//        char ch = 'a';
//        System.out.println(++ch);
//        int i = (int)'A';
//        System.out.println(i);
//        System.out.println((5 > 2)? true : false);

//        int number;
//Scanner input = new Scanner(System.in);
//System.out.print("Please Enter an Integer: ");
//number = input.nextInt();

//if(number % 5 == 0){
//    System.out.println("HiFive");
//} else {
//
//    System.out.println("");
//
//}

//System.out.println((number % 5 == 0) ? "HiFive": "");
//System.out.println((number % 2 == 0) ? "HiEven": "");

//if (number / 2 == 0) {
//    System.out.println("HiEven");
//} else {
//    System.out.println("");
//
//}
//        int num1, num2, response;
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter The First Number: ");
//        num1 = input.nextInt();
//        System.out.print("Enter The Second Number: ");
//        num2 = input.nextInt();
//
//        if(num1 >= num2){
//            int calc = num1 - num2;
//
//            System.out.println("What is "+ num1 + "-" + num2 + "? ");
//            System.out.print("Your Answer: ");
//            response = input.nextInt();
//
//            if(response == calc){
//                System.out.println("You have got the right answer");
//            } else {
//                System.out.println("You have got the wrong answer");
//            }
//        } else {
//            System.out.println("Failed Operation");
//        }

        int number;
     System.out.print("Enter an Integer: ");
     Scanner input = new Scanner(System.in);
    number = input.nextInt();

        System.out.println("Is " + number + "divisible by 2 and 3? " + (number % 2 == 0 && number % 3 == 0));
        System.out.println("Is " + number + "divisible by 2 or 3? " + (number % 2 == 0 ||number % 3 == 0));
        System.out.println("Is " + number + "divisible by 2 or 3, but not both? " + (number % 2 == 0 ^ number % 3 == 0));

        System.exit(0);

    }
}
