//Ryan Nguyen
//Making the board
import java.util.*;
public class Board
{
    //this is so the board can't be change 
    private String[][] board = new String[0][0];
    private int rows = 0;
    private int columns = 0;
    private String covered = "#";
    //this constructor take in two inputs row and column in order to create the boa
    public  Board(int row, int column)
    {
         rows = row;
         columns = column;
         board = new String[rows][columns];
    }
    //check to see if the minimum grid is 4x4 and the max is 10x10
    public boolean checkBoard()
    {
        if ((rows > 4 && columns > 4) && (rows < 10 && columns < 10))
            return true;
        return false;
    }
    //this will creature the board and return the board
    public void getBoard()
    {
      if (checkBoard() == true)
        for (int i = 0; i < board.length; i++)
       {
        for (int j =0; j < board[i].length; j++)
        {
        System.out.print(board[i][j] = covered);
       }
       System.out.println();
      }
      else
      {
          Scanner input = new Scanner(System.in);
          System.out.print("Please enter a valid row ");
          int newRow = input.nextInt();
          System.out.print("Please enter a valid column ");
          int newColumn = input.nextInt();
          
      }
        System.out.println("Please enter a valid grid, maximum is 10x10 and minimum is 4x4");
    }  
    }
