/**
 * Created by Lee Li Wei on 5/20/2017.
 */
public class Q4 {


    public static void main(String[] args){
        printNumbers(1,5,12);
    }
    public static void printNumbers(int num1, int num2, int numberPerLine){
        for(int counter = 0 ; counter <= numberPerLine; counter++){
            int counter2 = num1;
            while(counter2 <=num2){
                System.out.print(counter2 + " ");
                counter2++;
            }
            System.out.println();
        }


    }
}
