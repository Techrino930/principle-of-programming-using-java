/**
 * Created by techrino on 11/04/2017.
 */

import  java.util.*;
public class Practical3Q4 {

    public static void main(String[] args){
        double firstEdges, secondEdges, thirdEdges, total;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first edges: ");
        firstEdges = input.nextDouble();
        System.out.print("Enter the second edges: ");
        secondEdges = input.nextDouble();
        System.out.print("Enter the third edges: ");
        thirdEdges = input.nextDouble();

        if((firstEdges + secondEdges) > thirdEdges ){
            System.out.println("Input invalid");
        } else {
            total = firstEdges+secondEdges+thirdEdges;
            System.out.println("Total Perimeter" + total);
        }
    }

}
