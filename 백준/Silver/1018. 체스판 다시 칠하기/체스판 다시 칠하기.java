import java.util.Scanner;

public class Main {
    public static int getSolution(int startRow, int startCol, String[] board) {
        String[] orgBoard = {"WBWBWBWB","BWBWBWBW"};
        int cnt = 0;

        for(int i = 0 ; i < 8 ; i++){
            int row = startRow + i;
            for(int j = 0 ; j < 8 ; j++){
                int col = startCol + j;
                if(board[row].charAt(col) != orgBoard[i%2].charAt(j))   cnt++;
            }
        }
        return Math.min(cnt,64-cnt);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        row = scanner.nextInt();
        col = scanner.nextInt();
        scanner.nextLine();

        String[] board = new String[row];
        for(int i = 0 ; i < row ; i++)
            board[i] = scanner.nextLine();

        int sol = Integer.MAX_VALUE;
        for(int i = 0 ; i <= row - 8 ; i++){
            for(int j = 0 ; j <= col - 8 ; j++){
                int curSol = getSolution(i,j,board);

                if(sol > curSol)    sol = curSol;
            }
        }
        System.out.println(sol);
    }
}