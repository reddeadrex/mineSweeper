//Ryan Nguyen
//Tile
public class Tile 
{
    private int covered;
    private int marked;
    private int uncovered;
    private int[] tile;
    private boolean checkCovered = false;
    private boolean checkMarked = false;
    private boolean checkUncovered = false;
    private boolean checkCurrentState = false;
    public Tile()
    {
        covered = 0;
        marked = 1;
        uncovered = 2;
        tile = new int[3];
        tile[0] = 0;
        tile[1] = 1;
        tile[2] = 2;
    }
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
}