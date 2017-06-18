/**
 * Created by techrino on 11/04/2017.
 */
import java.util.*;
public class Practical3Q2 {

    public static void main(String[] args){
        double marks;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your mark: ");
        marks = input.nextDouble();

       if(marks >=90){
           System.out.println("Your Grade: A");
       } else if (marks >=80 && marks <=89){
           System.out.println("Your Grade: B");

       } else if (marks >=70 && marks <=79){
           System.out.println("Your Grade: C");

       } else if (marks >=60 && marks <=69){
           System.out.println("Your Grade: D");

       } else if (marks >=50 && marks <=59){
           System.out.println("Your Grade: E");

       } else {
           System.out.println("Your Grade: F");

       }
    }
}
