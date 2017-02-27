//Ryan Nguyen and Albert Nguyen
//Tile
public class Tile
{
  protected String tile;
  protected String marked;
  protected String uncovered;
  protected String bomb;
  protected boolean isMarked;
  protected boolean isBomb;
  protected int counter;
  public Tile()
    {
      //assigning values for each diffirent type of tiles
      bomb = "* | ";
      tile = "  | ";
      marked = "? | ";
      uncovered = "o | ";
      counter = 0;
    }
  public void numberOfMines()
  {
      counter++;
  }
  public void setNumberOfMines()
  {
      tile = "" + counter;
  }
  public String getCoveredTile()
  {
      tile = "  | ";
      return tile;
  }
  public String getTileNumberOfMines()
  {
      return tile;
  }
  public void setBombTile()
    {
      tile = bomb;
    }
  public void setMarked()
    {
      tile = marked;
    }
  public void setUncovered()
    {
      tile = uncovered;
    }
  public void setCovered()
  {
      tile = "  | ";
  }
  public String getTile()
    {
      return tile;
    }
  public String getTile2()
  {
      return bomb;
  }
  public String getMarkedTile()
   {
      //return the marked tile
      return marked;
   }
  public String getUncoveredTile()
    {
      //return the uncovered tile
      return uncovered;
    }
  public String getBombTile()
    {
      //return the tile with bomb in it;
      return bomb;
    }
  public boolean isItBomb()
  {
      if (tile == bomb)
        return true;
      return false;
  }
  public boolean isItMarked()
  {
      if (tile == marked)
        return true;
      return false;
  }
  public boolean checkForMarked()
    {
      //this checks and see if the covered tile is marked, and if it is then set it to true otherwise set it to false
      if (tile.equals(marked))
        return true;
      else 
        return false;
    }
  public boolean checkForUncovered()
    {
      //this checks and see if the covered tile is uncovered, and if it is then set it to true otherwise set it to false
      if (tile.equals(uncovered))
        return true;
      else
        return false;
    }
  public boolean checkForBomb()
    {
      //this checks and see if the covered tile is a bomb, and if it then set it to true otherwise set it to false
      if (tile.equals(bomb))
      {
        setBombTile();
        return true;
      }
      else
        return false;
    }
  public String toString()
  {
    if (checkForMarked() == true)
        return getMarkedTile();
    else if (checkForUncovered() == true)
        return getUncoveredTile();
    else if (checkForBomb() == true)
        return getBombTile();
    else
        return tile;
  }
}
