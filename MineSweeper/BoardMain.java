//Ryan Nguyen and Albert Nguyen
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
     //this is when the board is all covered up 
     mainBoard.setUpBoard();
     //prints out the board with all covered tiles 
     System.out.println(mainBoard);
     //set the board with mines 
     mainBoard.setUpBoardWithMines();
     do
      {
       System.out.print("Type 1 to open the tile, type 2 to mark the tile, or type 3 to unmark the tile: ");
       input.nextLine();
       int response = input.nextInt();
       System.out.println("Please enter row and column");
       row = input.nextInt();
       column = input.nextInt();
       mainBoard.UserResponse(response, row, column);
       //problem is here, the board is printing out the bomb symbol instead of staying covered
       System.out.println(mainBoard);
     } while(mainBoard.isTheGameOver(row,column) == false);
}
}

