

/**
 * Constructs player at given row, makes move method
 * 
 * @author (Kendrick and Javanshir) 
 * @version (12/11/15)
 */
import java.lang.Math;
import java.util.Scanner;
public class Player
{
    private int x;
    private int y;
    private String LM = "B";
    private int fatigue = 100;
    private int health = 100;
    //String user;
    String r = "@";
    //private int x = 26;
    //private int y = 99;
    //private String End= "E";

    /**
     *@precondition gR is from 0 and 26 while gC is from 0 and 99
     *Creates the player on a given coordinate on the map
     *@param gR is the given row that the player begins on
     *@param gC is the given column that the player begins on
     */
    public Player(int gR, int gC) 
    {
        y= gR;
        x=gC;
    }

    /**
     *Moves the player based on input
     *@param input is the user input, whether it be WASD or another key.  WASD triggers up, down, left, right respectively.  Another key keeps the player in the same square
     *@postcondition player moves up, down, left, or right one square.  If player is on the border of the map and tries to go out of bounds, he will remain in the same spot.  Fatigue and/or health change depending on what the new landmark is
     */
    public void Move(Scanner input)
    {
        String user = input.next();
        if (user.equalsIgnoreCase("d"))
        {   
            if (x!=99)
            {
                MapOne.setWorld(LM,y,x);
                x++;
                LM=MapOne.getWorld(y,x);
                if (LM.equals("^"))
                {
                    fatigue-=8;
                    if (fatigue<0)
                        health-=8;
                }
                if (LM.equals("Y"))
                {
                    fatigue-=5;
                    if (fatigue<0)
                        health-=5;
                }
                if (LM.equals("y"))
                {
                    fatigue-=3;
                    if (fatigue<0)
                        health-=3;
                }
                if (LM.equals("s"))
                {
                    fatigue-=1;
                    if (fatigue<0)
                        health-=1;
                }
                if (LM.equals("S"))
                    fatigue-=12;
                if (LM.equals("O"))
                {
                    fatigue-=50;
                    if (fatigue<0)
                        health-=50;
                }
                if (LM.equals("H"))
                {
                    fatigue-=60;
                    if (fatigue<0)
                        health-=60;
                }
                if (LM.equals("*"))
                {
                    fatigue-=2;
                    if (fatigue <0)
                        health-=2;
                }
                if (LM.equals("f"))
                    fatigue+=10;
                if (LM.equals("M"))
                {
                    fatigue -=1000;
                    if (fatigue <0)
                        health-=1000;
                }
                MapOne.setWorld("@",y,x);
            }
            else
            {
                MapOne.setWorld(LM,y,x);
                LM=MapOne.getWorld(y,x);
                MapOne.setWorld("@",y,x);
            }
        }
        if (user.equalsIgnoreCase("w"))
        {   
            if (y!=0)
            {
                MapOne.setWorld(LM,y,x);
                y--;
                LM=MapOne.getWorld(y,x);
                if (LM.equals("^"))
                {
                    fatigue-=8;
                    if (fatigue<0)
                        health-=8;
                }
                if (LM.equals("Y"))
                {
                    fatigue-=5;
                    if (fatigue<0)
                        health-=5;
                }
                if (LM.equals("y"))
                {
                    fatigue-=3;
                    if (fatigue<0)
                        health-=3;
                }
                if (LM.equals("s"))
                {
                    fatigue-=1;
                    if (fatigue<0)
                        health-=1;
                }
                if (LM.equals("S"))
                    fatigue-=12;
                if (LM.equals("O"))
                {
                    fatigue-=50;
                    if (fatigue<0)
                        health-=50;
                }
                if (LM.equals("H"))
                {
                    fatigue-=60;
                    if (fatigue<0)
                        health-=60;
                }
                if (LM.equals("*"))
                {
                    fatigue-=2;
                    if (fatigue <0)
                        health-=2;
                }
                if (LM.equals("f"))
                    fatigue+=10;
                if (LM.equals("M"))
                {
                    fatigue -=1000;
                    if (fatigue <0)
                        health-=1000;
                }
                MapOne.setWorld("@",y,x);
            }
            else
            {
                MapOne.setWorld(LM,y,x);
                LM=MapOne.getWorld(y,x);
                MapOne.setWorld("@",y,x);
            }
        }
        if (user.equalsIgnoreCase("a"))
        {   
            if (x!=0)
            {
                MapOne.setWorld(LM,y,x);
                x--;
                LM=MapOne.getWorld(y,x);
                if (LM.equals("^"))
                {
                    fatigue-=8;
                    if (fatigue<0)
                        health-=8;
                }
                if (LM.equals("Y"))
                {
                    fatigue-=5;
                    if (fatigue<0)
                        health-=5;
                }
                if (LM.equals("y"))
                {
                    fatigue-=3;
                    if (fatigue<0)
                        health-=3;
                }
                if (LM.equals("s"))
                {
                    fatigue-=1;
                    if (fatigue<0)
                        health-=1;
                }
                if (LM.equals("S"))
                    fatigue-=12;
                if (LM.equals("O"))
                {
                    fatigue-=50;
                    if (fatigue<0)
                        health-=50;
                }
                if (LM.equals("H"))
                {
                    fatigue-=60;
                    if (fatigue<0)
                        health-=60;
                }
                if (LM.equals("*"))
                {
                    fatigue-=2;
                    if (fatigue <0)
                        health-=2;
                }
                if (LM.equals("f"))
                    fatigue+=10;
                if (LM.equals("M"))
                {
                    fatigue -=1000;
                    if (fatigue <0)
                        health-=1000;
                }
                MapOne.setWorld("@",y,x);
            }
            else
            {
                MapOne.setWorld(LM,y,x);
                LM=MapOne.getWorld(y,x);
                MapOne.setWorld("@",y,x);
            }
        }
        if (user.equalsIgnoreCase("s"))
        {
            if (y!=26)
            {
                MapOne.setWorld(LM,y,x);
                y++;
                LM=MapOne.getWorld(y,x);
                if (LM.equals("^"))
                {
                    fatigue-=8;
                    if (fatigue<0)
                        health-=8;
                }
                if (LM.equals("Y"))
                {
                    fatigue-=5;
                    if (fatigue<0)
                        health-=5;
                }
                if (LM.equals("y"))
                {
                    fatigue-=3;
                    if (fatigue<0)
                        health-=3;
                }
                if (LM.equals("s"))
                {
                    fatigue-=1;
                    if (fatigue<0)
                        health-=1;
                }
                if (LM.equals("S"))
                    fatigue-=12;
                if (LM.equals("O"))
                {
                    fatigue-=50;
                    if (fatigue<0)
                        health-=50;
                }
                if (LM.equals("H"))
                {
                    fatigue-=60;
                    if (fatigue<0)
                        health-=60;
                }
                if (LM.equals("*"))
                {
                    fatigue-=2;
                    if (fatigue <0)
                        health-=2;
                }
                if (LM.equals("f"))
                    fatigue+=10;
                if (LM.equals("M"))
                {
                    fatigue -=1000;
                    if (fatigue <0)
                        health-=1000;
                }
                MapOne.setWorld("@",y,x);
            }
            else
            {
                MapOne.setWorld(LM,y,x);
                LM=MapOne.getWorld(y,x);
                MapOne.setWorld("@",y,x);
            }
        }
    }

    /**
     *@return the current row the player is on 
     */
    public int getRow()
    {
        return y;
    }

    /**
     *@return the current column the player is on 
     */
    public int getCol()
    {
        return x;
    }

    /**
     *@return the current fatigue value of the player 
     */
    public int getFatigue()
    {
        return fatigue;
    }
    /**
     *@return the current health value of the player 
     */
    public int getHealth()
    {
        return health;
    }
}
