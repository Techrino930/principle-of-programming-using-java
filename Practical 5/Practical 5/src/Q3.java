/**
 * Created by Lee Li Wei on 5/20/2017.
 */
public class Q3 {
    public static double poundToKilogram(double pound){
        double kilogram = 2.204 * pound;
        return  kilogram;
    }

    public static double kilogramToPound(double kilogram){
        double pound = kilogram / 2.204;
        return pound;
    }
    public static void main(String[] args){
        System.out.println("Miles \t\t\t Kilometers \t\t\t | \t\t\t Kilometers \t\t\t Miles");
        System.out.println("____________________________________________________________________________________");

        int counter2 = 20;
        while(counter2 <= 515){
            for(int counter  = 1; counter <= 199 ; counter+=2){
                System.out.print(counter +" \t\t\t\t\t "+ String.format("%.2f" , poundToKilogram(counter)));

                System.out.print("\t\t\t\t\t\t\t\t" + counter2 +" \t\t\t\t "+ String.format("%.2f" ,kilogramToPound(counter2)));
                counter2+=5;
                System.out.println();
            }
        }


    }
}
