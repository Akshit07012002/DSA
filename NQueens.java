import java.io.*;

public class NQueens {
    
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static int[][] board;
    static int[] ld = new int[30];
    static int[] rd = new int[30];
    static int[] cl = new int[30];

    public static void main(String[] args) throws Exception {

        System.out.print("Enter the number of queens: ");
        int n = Integer.parseInt(in.readLine());
        board = new int[n][n];
        NQueens nq = new NQueens();
        nq.initialize(); 
        
    }

    public void initialize() throws Exception {
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 0;
            }
        }

        for (int i = 0; i < 30; i++) {
            ld[i] = 0;
            rd[i] = 0;
            cl[i] = 0;
        }

        if(findSol(board, 0)==false) {
            System.out.println("No solution");
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    public boolean findSol(int[][] board, int col) {
        if (col >= board.length) {
            return true;
        }

        for (int i = 0; i < board.length; i++) {
            if ((ld[i - col + board.length - 1] != 1 && rd[i + col] != 1) && cl[i]!= 1){
                board[i][col] = 1;
                ld[i - col + board.length - 1] = rd[i + col] = cl[i] = 1;

                if (findSol(board, col + 1) == true) {
                    return true;
                }

                board[i][col] = 0;
                ld[i - col + board.length - 1] = rd[i + col] = cl[i] = 0;
            }
        }
        return false;
    }

    

}
