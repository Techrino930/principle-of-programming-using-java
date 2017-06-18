/**
 * Created by techrino on 16/05/2017.
 */
public class Q3 {
    public static void main(String[] args) {


/*
        two dimensional array
*/
        int[][] employee = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };
        int sum = 0;
        int employeeIndex = employee.length;
        System.out.println("The total working hours in a week for");
        for (int counter = 0; counter < employeeIndex; counter++) {
            for (int counter2 = 0; counter2 < 7; counter2++) {
                sum = sum + employee[counter][counter2];
                //sum each of the employee total working hours
            }
            System.out.print("Employee " + counter + " is " + sum);

            System.out.println();
            sum = 0;
//           reset sum back to 0

        }
    }
}
