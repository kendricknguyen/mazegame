
/**
 * Constructs a monster on a given row and gives it an RNG move method
 * 
 * @author (Kendrick and Javanshir) 
 * @version (12/11/15)
 */
import java.lang.Math;
import java.util.Scanner;
import java.util.Random;
public class Monster
{
    private int x;
    private int y;
    private int MaxRow;
    private int MaxCol;
    private String LM = "H";
    String monster = "M";
    /**
     *Summons a monster at a given row and column and sets its boundaries 
     *@precondition gMaxCol must be from 0 to 99, gC must be from 0 to MaxCol, gC must be from 0 and 26
     *@param gR is the given row that the monster will spawn
     *@param gC is the given column tha the monster will spawn
     *@param gMaxCol sets the farthest column that the monster can reach
     */
    public Monster(int gR, int gC, int gMaxCol)
    {
        x = gC;
        y = gR;
        MaxCol= gMaxCol;
    }

    /**
     * @postcondition Monster moves in a random direction, if monster is on border of game, it moves away from the border
     */
    public void MonsterMove()
    {
        if ((x!=0&&y!=26&&y!=0)&&x<=94)
        {
            MapOne.setWorld(LM,y,x);
            Random num = new Random();
            int rng = num.nextInt(4);
            if(rng == 0)
            {
                x++;
            }
            if(rng == 1)
                x--;
            if(rng == 2)
                y++;
            if(rng == 4)
                y--;
            MapOne.setWorld("M",y,x);
        }
        else
        {
            MapOne.setWorld(LM,y,x);
            if (x==0)
                x++;
            if (y==0)
                y++;
            if (y==26)
                y--;
            MapOne.setWorld("M",y,x);
        }
    }

    /**
     *@return the given row of the Monster 
     */
    public int getRow()
    {
        return y;
    }

    /**
     *@return the given column of the Monster 
     */
    public int getCol()
    {
        return x;
    }
}

