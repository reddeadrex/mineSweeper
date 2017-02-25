//Ryan Nguyen
//Making the board
import java.util.*;
public class GameBoard
{
  private int rows;
  private int columns;
  private Tile[][] board;
  private int[][] positionOfMines;
  public GameBoard(int row, int column)
  {
    //instantiating the board
    rows = row;
    columns = column;
    board = new Tile[row][column];
  }
  public void distributeMines(int mines)
  {
    int x = 0;
    //this will distributes the mines in the 2d array
    int numberOfMines = mines / 2;
    //stores the location of the mines in anothe 2d array;
    for (int i = 0; i < rows;i++)
    {
      for (int j = 0; j < 2;j++)
      int randomRows = (int) (rows * Math.random());
      int randomColumns = (int) (columns * Math.random());
      positionOfMines[i][j] = (int)(numberOfMines * Math.random());
      }
    }
  }
}
