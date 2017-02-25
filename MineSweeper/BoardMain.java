//Ryan Nguyen
//test the board
import java.util.*;
public class BoardMain
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Row dimension: ");
        int row = input.nextInt();
        System.out.print("Column dimension: ");
        int column = input.nextInt();
        System.out.print("Amount of Mines: ");
      	int numMines = input.nextInt();
        GameBoard mainBoard = new GameBoard(numMines,row,column);
        /*need to go to the loop in order to return the board\
      	gotta keep game going my man until you hit a mine 
        either do loop or while loop 
        */
        for (int i = 0; i < 1;i++)
        {
            mainBoard.getBoard();
        }
    }
}