/**
 * Created by techrino on 16/05/2017.
 */
public class Q4 {

    public static void main(String[] args) {
        System.out.println("TicTacToe board: ");
        int[][] board = new int[3][3];


        for (int counter = 0; counter < 3; counter++) {

            for (int counter2 = 0; counter2 < 3; counter2++) {
                int random = (Math.random() < 0.5) ? 0 : 1;

                board[counter][counter2] = random;

            }

        }
        for (int counter = 0; counter < 3; counter++) {
            for (int counter2 = 0; counter2 < 3; counter2++) {
                System.out.print(board[counter][counter2] + " ");

            }
            System.out.println();
        }

        System.out.println("Result(s): ");
        if (board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1) {
            System.out.println("All 1's on row 0");
        }
        if (board[0][0] == 0 && board[0][1] == 0 && board[0][2] == 0) {
            System.out.println("All 0's on row 0");
        }
        if (board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1) {
            System.out.println("All 1's on row 1");
        }
        if (board[1][0] == 0 && board[1][1] == 0 && board[1][2] == 0) {
            System.out.println("All 0's on row 1");
        }
        if (board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1) {
            System.out.println("All 1's on row 2");
        }
        if (board[2][0] == 0 && board[2][1] == 0 && board[2][2] == 0) {
            System.out.println("All 0's on row 2");
        }
        if (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) {
            System.out.println("All the 1 on subdiagonal");
        }
        if (board[0][0] == 0 && board[1][1] == 0 && board[2][2] == 0) {
            System.out.println("All the 0 on subdiagonal");
        }
        if (board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1) {
            System.out.println("All the 1 on subdiagonal");
        }
        if (board[0][2] == 0 && board[1][1] == 0 && board[2][0] == 0) {
            System.out.println("All the 0 on subdiagonal");
        }
        if(board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1){
            System.out.println("All the 1 on column 0");
        }
        if(board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1){
            System.out.println("All the 1 on major diagonal");
        }
        if(board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1){
            System.out.println("All the 1 on column 2");
        }
        //
        if(board[0][0] == 0 && board[1][0] == 0 && board[2][0] == 0){
            System.out.println("All the 0 on column 0");
        }
        if(board[0][1] == 0 && board[1][1] == 0 && board[2][1] == 0){
            System.out.println("All the 0 on major diagonal");
        }
        if(board[0][2] == 0 && board[1][2] == 0 && board[2][2] == 0){
            System.out.println("All the 0 on column 2");
        }


    }
}
