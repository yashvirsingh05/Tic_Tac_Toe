
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;
public class Tic_Tac_Toe5 {
    public static void main(String[] args) {
        while (true) {
            int count1 = 0;
            int count2 = 0;
            char index = ' ';
            char variable = 'X';
            int countElement = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("---------");
            char[][] newCells = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
            System.out.print("| ");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(newCells[i][j] + " ");
                }
                if (i != 2) {
                    System.out.print("|\n| ");
                } else {
                    System.out.println("|");
                }
            }
            System.out.println("---------");
        }

    }
}