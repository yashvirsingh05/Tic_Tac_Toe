import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;
public class Tic_Tac_Toe4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cells: ");
        char[] cells = sc.next().toUpperCase().toCharArray();
        System.out.println("---------");
        char[][] newCells = {{cells[0], cells[1], cells[2]}, {cells[3], cells[4], cells[5]}, {cells[6], cells[7], cells[8]}};
        System.out.print("| ");
    }
}