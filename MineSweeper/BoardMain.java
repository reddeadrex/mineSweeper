 

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
      gameBoard mainBoard = new gameBoard(numMines,row,column);
        /*need to go to the loop in order to return the board\
        gotta keep game going my man until you hit a mine 
        either do loop or while loop 
        */
       mainBoard.setUpBoard();
       System.out.println(mainBoard);
       System.out.println("Type 1 to open the tile and type 2 to mark the tile");
       input.nextLine();
       int response = input.nextInt();
       System.out.println("Please enter row");
       row = input.nextInt();
       System.out.println("Please enter column");
       column = input.nextInt();
       mainBoard.UserResponse(response, row, column);
       System.out.println(mainBoard);
    }
}