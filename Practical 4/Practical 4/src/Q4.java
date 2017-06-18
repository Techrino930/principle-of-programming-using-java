import java.util.Scanner;

/**
 * Created by Lee Li Wei on 5/19/2017.
 */
public class Q4 {
    public static void main(String[] args){
        System.out.print("Please Enter the length of the *: ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        for(int counter = 0 ; counter < length ; counter ++){
            for(int counter1 = 0 ; counter1 < length ; counter1 ++){
                System.out.print("*");



            }
            System.out.print("\t");

            for(int counter2 = 0 ; counter2 < length ; counter2 ++){


                if(counter==0 || counter==length-1)
                {
                    System.out.print("*");
                }
                else if(counter2==0 || counter2==length-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
