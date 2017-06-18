/**
 * Created by Lee Li Wei on 5/20/2017.
 */
public class Q2 {
    public static double mileToKilometer(double mile){
        double kilometer = mile * 1.6;
        return  kilometer;
    }

    public static double kilometerToMile(double kilometer){
        double mile = kilometer / 1.6;
        return mile;
    }
    public static void main(String[] args){
        System.out.println("Miles \t\t\t Kilometers \t\t\t | \t\t\t Kilometers \t\t\t Miles");
        System.out.println("____________________________________________________________________________________");

            int counter2 = 20;
            while(counter2 <= 65){
                for(int counter  = 1; counter <= 10 ; counter++){
                    System.out.print(counter +" \t\t\t\t\t "+ String.format("%.2f" , mileToKilometer(counter)));

                    System.out.print("\t\t\t\t\t\t\t\t" + counter2 +" \t\t\t\t "+ String.format("%.2f" ,kilometerToMile(counter2)));
                counter2+=5;
                System.out.println();
            }
        }


    }
}
