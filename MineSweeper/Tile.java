//Ryan Nguyen
//Tile
public class Tile 
{
    private int covered = 0;
    private int marked = 1;
    private int uncovered = 2;
    private int adjacentMine = (int) (8 * Math.random() + 1);
    private int[] tile = new int[1];
    private boolean checkCovered = false;
    private boolean checkMarked = false;
    private boolean checkUncovered = false;
    private boolean checkCurrentState = false;
    public int getCovered()
    {
        return covered;
    }
    public int getMarked()
    {
        return marked;
    }
    public int uncocered()
    {
        return uncovered;
    }
    public int adjacentMine()
    {
        return adjacentMine;
    }
    public boolean checkCurrentState()
    {
        for (int i = 0 ;i < tile.length;i++)
        {
            if (tile[i] == 0)
                {
                    checkCovered = true;
                    checkCurrentState = checkCovered;
                }
            else if (tile[i] == 1)
            {
                checkMarked = true;
                checkCurrentState = checkMarked;
            }
            else if (tile[i] == 2)
            {
                checkUncovered = true;
                checkCurrentState = checkUncovered;
            }
        }
        return checkCurrentState;
    }
    public void setTileIsCovered()
    {
        if (checkCurrentState() == checkCovered)
        {
            System.out.println("The tile is covered");
            for (int i = 0; i < 1;i++)
            {
                tile[0] = 0;
            }
        }
    }
    public void setTileMarked()
    {
        if (checkCurrentState() == checkMarked)
        {
            System.out.println("The tile is marked");
            for (int i = 0; i < 1;i++)
            {
                tile[0] = 1;
            }
        }
    }
    public void setTileUncovered()
    {
        if (checkCurrentState() == checkUncovered)
        {
            
        }
    }
}