//Albert Nguyen and Ryan Nguyen
import java.util.*;
public class GameBoard
{
  private int mines;
  private int rows;
  private int columns;
  private Tile[][] board = new Tile[0][0];
  private int[][] positionOfMines;
  public GameBoard(int mine,int row, int column)
  {
    //instantiating the board
    mines = mine;
    rows = row;
    columns = column;
    board = new Tile[rows][columns];
    positionOfMines = new int[row][columns];
  }
  //this method will instantiate the mines on the board
  public void distributeMines()
  {
   //new Algorith: go through the loops and set bombs to random tiles
   for (int i = 0 ; i < mines;i++)
   {
       for (int j = 0; j < 1;j++)
       {
           //set the tile at the specifc location to a bomb tile
           board[(int)(Math.random() * rows)][(int)(Math.random() * columns)].setBombTile();
       }
   }
 
//     //this will store the position of the mines in a 2d array
//     for (int i = 0; i < mines;i++)
//     {
//       for (int j = 0; j < 2;j++)
//     {
//         //this 2d array takes in the position of where the mine will be 
//         positionOfMines[i][j] = (int)(mines * Math.random());
//         board[positionOfMines[i][j]][positionOfMines[i][j]].setBombTile();
//         //this is where the board will refer back to the 2d array called positionOfmines and call the method getBombTile() in order to change the value of
//         //covered tile to bomb tile
//     }
//     }
  }
  /*Algorithm: First let's loop through the board, and check for the first index of the mines and the index + 1 which is the one right next to it
  and see if the one next to it is a bomb if it is then we will simply update a counter and print it at the end to displace how many bombs are next to it
  public void adJacentMines
  */
  public void countForAdjacentMines(int row, int column)
  {
    //first let's make a couner that will keep up how many mines are in the vicinity of our one mine
    //now let's go through a loop to check for each element in the index because we don't really know where the mines are exactly
    //checks lower diagonal right
    if (board[row+1][column+1].getTile().equals(board[row+1][column+1].getBombTile()))
          {
            //we will simply update the counter to see how many mines are around
            board[row][column].numberOfMines();
            
          }
    //this checks upper left diagonal
    if (board[row-1][column-1].getTile().equals(board[row-1][column+1].getBombTile()))
          {
            board[row][column].numberOfMines();
          }
    //this checks to the right
    if (board[row][column+1].getTile().equals(board[row][column+1].getBombTile()))
          {
           board[row][column].numberOfMines();
           
          }
    //this checks to the left
    if (board[row][column-1].getTile().equals(board[row][column-1].getBombTile()))
       {
            board[row][column].numberOfMines();
       }
    //this checks the top tile
    if (board[row-1][column].getTile().equals(board[row-1][column].getBombTile()))
       {
            board[row][column].numberOfMines();
       }
    //this checks the bottom tile
    if (board[row+1][column].getTile().equals(board[row+1][column].getBombTile()))
      {
            board[row][column].numberOfMines();
      }
    //this shows upper diagonal right
    if (board[row-1][column+1].getTile().equals(board[row+1][column].getBombTile()))
    {
            board[row][column].numberOfMines();
    }
    //this shows bottom diagnoal left 
    if (board[row+1][column-1].getTile().equals(board[row+1][column-1].getBombTile()))
    {
            board[row][column].numberOfMines();
    }
}
//this method gives the user the option to either uncover, mark, or unmark
public void UserResponse(int response,int row, int column)
{
    //first option let's you uncover a tile
    if (response == 1)
    {
        if (isTheGameOver(row,column) == true)
        {
            System.out.println("gtfo, you suck");
        }
        else if (isWinner(row,column) == true)
        {
            System.out.println("It's not like i love you! BAKA!!!");
        }
        else
        {
                if (board[row][column].getTile().equals(board[row][column].getMarkedTile()))
                {
                    board[row][column].setMarked();
                    board[row][column].getMarkedTile();
                }
                else
                {
                    countForAdjacentMines(row,column);
                    board[row][column].setNumberOfMines();
                    //gotta somehow return the uncoverd tile to the tile at this specific location 
                    board[row][column].getTileNumberOfMines();
                }
   }
}
    //second option let's you mark a tile
    else if (response == 2)
        
    {
          board[row][column].setMarked();
          board[row][column].getMarkedTile();
    }
    //third option let's you unmark a tile 
    else if (response == 3)
    {
          board[row][column].getTile();
    }
    }
//this method will instantiate the board before any changes
public void setUpBoard()
{
    for (int i = 0; i < board.length;i++)
    {
        for (int j = 0; j < board[i].length;j++)
        {
            board[i][j] = new Tile();
            //now we will distribute the mines throughout the field 
        }
    }
}
//this is the board with the mines in it
public void setUpBoardWithMines()
{
    distributeMines();
}
//this method checks to see if the game is over
public boolean isTheGameOver(int row, int column)
{
    //you lose if you land on any mines
    //check if the user hit the tile with a bomb on it 
    if (board[row][column].getTile().equals(board[row][column].getBombTile()))
        return true;
    return false;
}
//this checks if you won the game or not 
public boolean isWinner(int row,int column)
{
    for (int i = 0; i < mines;i ++)
    {
        if (board[row][column].getBombTile().equals(board[row][column].getMarkedTile()))
            return true;
    }
    return false;
}
//this is where we will display the current condition of the board
public String toString()
    {
        System.out.print("   ");
        int count = 0;
        for(int j = 0; j < board.length; j++)
        {
            for(int i = 0; i<board[j].length; i++)
            {
                if(count < board[j].length)
                {
                    System.out.print(" " + count + "  ");
                    count++;
                }
            }
        }
        
        
        for(int i = 0; i<board.length; i++)
        {
          System.out.println("\t");
          System.out.print("  ");
            for(int k = 0; k<board[i].length;k++)
          {
              System.out.print("+---");
          }
            System.out.print("+");
            System.out.print("\n" +i + " | ");
            for(int j = 0; j<board[0].length; j++)
            {
                System.out.print(board[i][j].getTile());
            }
        }
        System.out.println(" ");   
        System.out.print("  ");
        int count2 = 0;
        for(int i = 0; i < board.length; i++)
        {
            for(int k = 0; k<board[i].length;k++)
            {
                if(count2 < board[i].length)
                {
                    System.out.print("+---");
                    count2++;
                }
            }
        }
        System.out.print("+");
          return "";
    }
}
