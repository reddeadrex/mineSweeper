import java.util.*;
public class GameBoard
{
  private int mines;
  private int rows;
  private int columns;
  private Tile board = new Tile();;
  private String[][] gameBoard;
  private int[][] positionOfMines;
  public GameBoard(int mine,int row, int column)
  {
    //instantiating the board
    mines = mine;
    rows = row;
    columns = column;
    gameBoard = new String[rows][columns];
    positionOfMines = new int[mines][2];
  }
  public void getBoard()
  {
      for (int i = 0; i < gameBoard.length;i++)
      {
          for (int j = 0; j < gameBoard[i].length;j++)
          {
              System.out.print(gameBoard[i][j] = board.getCoveredTile());
          }
          System.out.println();
      }
  }
  public void distributeMines()
  {
    //this will distributes the mines in the 2d array
    //stores the location of the mines in anothe 2d array;
    for (int i = 0; i < mines;i++)
    {
      for (int j = 0; j < 2;j++)
    {
        positionOfMines[i][j] = (int)(mines * Math.random());
        for (int k = 0;k < mines;k++)
        {
            for (int l = 0; l < 2;l++)
            {
                gameBoard[positionOfMines[i][j]][positionOfMines[i][j]] = board.getBombTile();
            }
        }
    }
    }
  }
}



