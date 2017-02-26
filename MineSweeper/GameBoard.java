 

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
    //instantiating the gameBoard
    mines = mine;
    rows = row;
    columns = column;
    board = new Tile[rows][columns];
    positionOfMines = new int[mines][2];
  }
  //this method will create the gameBoard with all the tiles covered
  //this method will distributes the mines, however it is still covered
  //Underneath the covered tile, the value has been set to a bomb tile
  //so when the user pick that tile it is game over
//   public void distributeMines()
//   {
//     //this will store the position of the mines in a 2d array
//     for (int i = 0; i < mines;i++)
//     {
//       for (int j = 0; j < 2;j++)
//     {
//         positionOfMines[i][j] = (int)(mines * Math.random());
//         //this is where the gameBoard will refer back to the 2d array called positionOfmines and call the method getBombTile() in order to change the value of
//         //covered tile to bomb tile
//         for (int k = 0;k < mines;k++)
//         {
//             for (int l = 0; l < 2;l++)
//             {
//               //the position at that location has been change from coverd tile to bomb tile
//               gameBoard[positionOfMines[i][j]][positionOfMines[i][j]] = board.getBombTile();
//             }
//         }
//     }
//     }
//   }
  //this method will count the number of adjacent mines
  /*Algorithm: First let's loop through the gameBoard, and check for the first index of the mines and the index + 1 which is the one right next to it
  and see if the one next to it is a bomb if it is then we will simply update a counter and print it at the end to displace how many bombs are next to it
  public void adJacentMines
  */
//   public void countForAdjacentMines()
//   {
//     //first let's make a couner that will keep up how many mines are in the vicinity of our one mine
//     int counter = 0;
//     //now let's go through a loop to check for each element in the index because we don't really know where the mines are exactly
//     for (int i = 0; i < gameBoard.length;i++)
//     {
//       for (int j = 0; j < gameBoard.length;j++)
//       {
//         //now we need to check if the current index we have is a tile that does not contain a bomb, and if it does contain a bomb then we will simply update that counter
//         while (gameBoard[i][j].equals(board.getCoveredTile()))
//         {
//           //checks diagonal right
//           if (gameBoard[i+1][j+1].equals(board.getBombTile()))
//           {
//             //we will simply update the counter
//             counter++;
//             gameBoard[i+1][j+1] = "" + counter;
//           }
//           //this checks upper left diagonal
//           else if (gameBoard[i-1][j-1].equals(board.getBombTile()))
//           {
//             counter++;
//             gameBoard[i-1][j-1] = "" + counter;
//           }
//           //this checks to the right
//           else if (gameBoard[i][j+1].equals(board.getBombTile()))
//           {
//             counter++;
//             gameBoard[i][j+1] = "" + counter;
//           }
//           //this checks to the left
//           else if (gameBoard[i][j-1].equals(board.getBombTile()))
//           {
//             counter++;
//             gameBoard[i][j-1] = "" + counter;
//           }
//           //this checks the top tile
//           else if (gameBoard[i-1][j].equals(board.getBombTile()))
//           {
//             counter++;
//             gameBoard[i-1][j] = "" + counter;
//           }
//           //this checks the bottom tile
//           else if (gameBoard[i+1][j].equals(board.getBombTile()))
//           {
//             counter++;
//             gameBoard[i+1][j] = "" + counter;
//           }
//         }
//       }
//     }
//   }

public void UserResponse(int response,int row, int column)
{
    if (response == 1)
    {
        board[row][column].setUncovered();
        //gotta somehow return the uncoverd tile to the tile at this specific location 
        board[row][column].getTile();
    }
    else if (response == 2)
    {
        board[row][column].setMarked();
        board[row][column].getMarkedTile();
    }
}

public void setUpBoard()
{
    for (int i = 0; i < board.length;i++)
    {
        for (int j = 0; j < board.length;j++)
        {
            board[i][j] = new Tile();
        }
    }
}
public String toString()
    {
        System.out.print("   ");
        int count = 0;
        for(int j = 0; j < gameBoard.length; j++)
        {
            for(int i = 0; i<gameBoard[j].length; i++)
            {
                if(count < gameBoard[j].length)
                {
                    System.out.print(" " + count + "  ");
                    count++;
                }
            }
        }
        
        
        for(int i = 0; i<gameBoard.length; i++)
        {
          System.out.println("\t");
          System.out.print("  ");
            for(int k = 0; k<gameBoard[i].length;k++)
          {
              System.out.print("+---");
          }
            System.out.print("+");
            System.out.print("\n" +i + " | ");
            for(int j = 0; j<gameBoard[0].length; j++)
            {
                System.out.print(gameBoard[i][j] = board.getCoveredTile());
            }
        }
        System.out.println(" ");   
        System.out.print("  ");
        int count2 = 0;
        for(int i = 0; i < gameBoard.length; i++)
        {
            for(int k = 0; k<gameBoard[i].length;k++)
            {
                if(count2 < gameBoard[i].length)
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
