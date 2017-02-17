//Ryan Nguyen
//test the board
import java.util.*;
public class BoardMain
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("row dimension? ");
        int row = input.nextInt();
        System.out.print("Column dimension? ");
        int column = input.nextInt();
        Board mainBoard = new Board(row,column);
        //need to go to the loop in order to return the board\
         for (int i = 0; i < 1;i++)
         {
         mainBoard.getBoard();
        }
    }
}