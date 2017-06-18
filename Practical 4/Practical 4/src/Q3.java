/**
 * Created by Lee Li Wei on 5/19/2017.
 */
public class Q3 {

    public static void main(String[] args){
        for(int counter = 1; counter <= 10 ; counter ++){
            for(int counter2 = 1 ; counter2 <= 10; counter2 ++)
            {
                int result = counter * counter2;
                System.out.print("\t " + result + "\t");
            }
            System.out.println();
        }
    }
}
