//Ryan Nguyen
//Tile
public class Tile
{
  protected String tile;
  protected String marked;
  protected String uncovered;
  protected String bomb;
    public Tile()
    {
      //assigning values for each diffirent type of tiles
      bomb = " * ";
      tile = "   ";
      marked = " ? ";
      uncovered = " o ";
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
    public String getCoveredTile()
    {
      return tile;
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
    public void setBombInTile()
    {

    }
  public String toString()
  {
    return tile;
  }
}
