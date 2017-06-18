/**
 * Created by Lee Li Wei on 5/24/2017.
 */
import java.util.Scanner;
public class Q6 {
    public static void checkPassword(String password){
        int character = 0;
        boolean validate1 = true, validate2 = true, validate3 = true;
        for(int j = 0 ; j < password.length() ; j++){

            if(Character.isLetter(password.charAt(j))){
                character = character +  1;

            }
        }
        if(character < 10){
           validate1 = false;

        }

        int digit = 0;
        for(int k = 0 ; k < password.length() ; k++){

            if(Character.isLetter(password.charAt(k))){
                digit = digit +  1;

            }
        }
        if(digit < 3){
         validate2 = false;

        }
       for(int i = 0 ; i < password.length() ; i++){
            if(!Character.isLetterOrDigit(password.charAt(i))){
           validate3 = false;
                break;
            }
       }
       if(!validate1  || !validate2  || !validate3){
            System.out.print("Invalid");
       } else {
           System.out.print("Valid");

       }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter a password : ");
        String password = input.nextLine();
        checkPassword(password);
    }
}
