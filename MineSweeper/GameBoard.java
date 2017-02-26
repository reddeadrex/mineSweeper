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
    //instantiating the gameBoard
    mines = mine;
    rows = row;
    columns = column;
    gameBoard = new String[rows][columns];
    positionOfMines = new int[mines][2];
  }
  //this method will create the gameBoard with all the tiles covered
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
  //this method will distributes the mines, however it is still covered
  //Underneath the covered tile, the value has been set to a bomb tile
  //so when the user pick that tile it is game over
  public void distributeMines()
  {
    //this will store the position of the mines in a 2d array
    for (int i = 0; i < mines;i++)
    {
      for (int j = 0; j < 2;j++)
    {
        positionOfMines[i][j] = (int)(mines * Math.random());
        //this is where the gameBoard will refer back to the 2d array called positionOfmines and call the method getBombTile() in order to change the value of
        //covered tile to bomb tile
        for (int k = 0;k < mines;k++)
        {
            for (int l = 0; l < 2;l++)
            {
              //the position at that location has been change from coverd tile to bomb tile
                gameBoard[positionOfMines[i][j]][positionOfMines[i][j]] = board.getBombTile();
            }
        }
    }
    }
  }
  //this method will count the number of adjacent mines
  /*Algorithm: First let's loop through the gameBoard, and check for the first index of the mines and the index + 1 which is the one right next to it
  and see if the one next to it is a bomb if it is then we will simply update a counter and print it at the end to displace how many bombs are next to it
  public void adJacentMines
  */
  public void countForAdjacentMines()
  {
    //first let's make a couner that will keep up how many mines are in the vicinity of our one mine
    int counter = 0;
    //now let's go through a loop to check for each element in the index because we don't really know where the mines are exactly
    for (int i = 0; i < gameBoard.length;i++)
    {
      for (int j = 0; j < gameBoard.length;j++)
      {
        //now we need to check if the current index we have is a tile that does not contain a bomb, and if it does contain a bomb then we will simply update that counter
        while (gameBoard[i][j].equals(board.getCoveredTile()))
        {
          //checks diagonal right
          if (gameBoard[i+1][j+1].equals(board.getBombTile()))
          {
            //we will simply update the counter
            counter++;
            gameBoard[i+1][j+1] = "" + counter;
          }
          //this checks upper left diagonal
          else if (gameBoard[i-1][j-1].equals(board.getBombTile()))
          {
            counter++;
            gameBoard[i-1][j-1] = "" + counter;
          }
          //this checks to the right
          else if (gameBoard[i][j+1].equals(board.getBombTile()))
          {
            counter++;
            gameBoard[i][j+1] = "" + counter;
          }
          //this checks to the left
          else if (gameBoard[i][j-1].equals(board.getBombTile()))
          {
            counter++;
            gameBoard[i][j-1] = "" + counter;
          }
          //this checks the top tile
          else if (gameBoard[i-1][j].equals(board.getBombTile()))
          {
            counter++;
            gameBoard[i-1][j] = "" + counter;
          }
          //this checks the bottom tile
          else if (gameBoard[i+1][j].equals(board.getBombTile()))
          {
            counter++;
            gameBoard[i+1][j] = "" + counter;
          }
        }
      }
    }
  }
  //this method will be used to uncover or mark/unmark a tile at a specific location on the board
  //First, we must ask the user the specific location where they would like to either uncover, mark, or unmark
  public void optionToUncoverOrMarkOrUnmark(int row, int column, char option)
  {
    //we need to know what option they picked
    //so let's check for when they want to uncover a tile
     if (option == "U")
     {
       countForAdjacentMines();
       gameboard[row][column] = board.getUncoveredTile();
     }
     else if (option == "M")
     {
       countForAdjacentMines();
       gameBoard[row][colummn] = board.getMarkedTile();
     }
     else if(option = "u")
     {
       countForAdjacentMines();
       gameBoard[row][column] = board.getCoveredTile();
     }
    }
    //this method will check if the game is either over or still going
    public void checkToSeeIfTheGameIsOver()
    {
      //A game is over if all tiles with mines are marked and all tiles without mines are uncovere
      //you lose if any tile with a mine is uncovered

    }
}
