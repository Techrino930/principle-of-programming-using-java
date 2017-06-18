/**
 * Created by Lee Li Wei on 5/24/2017.
 */
import java.util.Scanner;
public class Q5 {

    public static void printMatrix(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 1; j <= n ; j ++){
                System.out.print(((Math.random() < 0.5) ? 0 : 1) + " " );
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();
        printMatrix(n);

    }
}
