/**
 * Created by techrino on 11/04/2017.
 */
import java.util.*;
public class Practical3Q3 {


    public static void main(String[] args){
        int age;
        System.out.print("Please Enter Your Age: ");
        Scanner input = new Scanner(System.in);

        age = input.nextInt();

        if(age >= 65 ){
            System.out.println("Senior Citizen");
        } else if(age >= 19 && age <= 64){
            System.out.println("Adult");

        } else if (age >=13 && age <=18){
            System.out.println("Teenager");

        } else if (age >=0 && age <=12){
            System.out.println("Child");

        } else {
            System.out.println("Invalid Age");

        }


    }
}
