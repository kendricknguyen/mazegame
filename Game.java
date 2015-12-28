
/**
 * The main Game, spawns the player and monster.
 * 
 * @author (Kendrick Nguyen and Javanshir Pashayev) 
 * @version (12/11/15)
 */
import java.util.*;
public class Game
{
    // instance variables - replace the example below with your own

    /**
     *Presents instructions to the game, and begins when the user enters "s"
     *Proceeds to initiate 5 monsters on the map and start the player at (0,0)
     *Randomizes the monster moves and allows the player to move while keeping track of fatigue and health
     *If player reaches X, win. If player's health goes below 0, ends game.
     */
    public static void main(String []args)
    {
        System.out.println("Welcome to Lofgren's Mercy. Mr. Lofgren has been absolutely disappointed with your effort in class and has decided to create a challenge for you. \nIn order to rectify your failure as a student, Lofgren has marooned you on an island filled with the fiends of hell that spread death and decay wherever they move. \nIn your possesion is a map which informs you that Lofgren awaits in his legendary yacht on the opposite corner of the island. You mark this location with an X and your own location with @. \n\nPress W to move up, S to move down, A to move left, D to move right. \n\nWhen ready, press s");
        Scanner input2= new Scanner(System.in);
        String start;
        try{
            start = input2.next();
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Incorrect entry");
            start = " ";
        }
        if (start.equalsIgnoreCase("s"))
        {
            Player p1 = new Player(0,0);
            Monster m1 = new Monster(12,24,95);
            Monster m2 = new Monster(20,83,96);
            Monster m3 = new Monster (2,15,95);
            Monster m4 = new Monster (3,40, 95);
            Monster m5 = new Monster (1,78, 98);
            MapOne map = new MapOne();
            map.makeWorld();
            while (!(p1.getRow()==26&&p1.getCol()==99)&&p1.getHealth()>0)
            {
                map.setWorld("@",p1.getRow(),p1.getCol());
                map.setWorld("M",m1.getRow(),m1.getCol());
                map.setWorld("M",m2.getRow(),m2.getCol());
                map.setWorld("M",m3.getRow(),m3.getCol());
                map.setWorld("M",m4.getRow(),m4.getCol());
                map.setWorld("M",m5.getRow(),m5.getCol());
                map.setWorld("X",26,99);
                m1.MonsterMove();
                m2.MonsterMove();
                m3.MonsterMove();
                m4.MonsterMove();
                m5.MonsterMove();
                map.printWorld();
                Scanner input = new Scanner(System.in);
                System.out.println("Your fatigue is "+p1.getFatigue()); 
                System.out.println("Your health is "+p1.getHealth());
                System.out.println(" \n \n_ = Plains(fatigue = no damage taken)\nB = Base (starting point) E = End (Ending point or X)\n^ = Mountain (fatigue = -8)\nf = Fruit/berry (fatigue = +10)\n* = hill (fatigue = -2)\ny = small forest (fatigue = -3)   s = small waterway (fatigue = -1)\nY = Big forest   (fatigue = -5)   S = Big waterway   (fatigue = -12)\nO = Pit (fatigue = -50)\nH = Hellhole(fatigue = -60)\nM = Monster >:)\nWhen your fatigue depletes, your health starts to lose the same amount!");
                p1.Move(input);
            }
            if (p1.getRow()==26 && p1.getCol()== 99)
            {
                map.setWorld("@",p1.getRow(),p1.getCol());
                map.printWorld();
                System.out.print("YOU HAVE REDEEMED YOURSELF TO LOFGREN AND GET A C!!");
            }
            if (p1.getHealth()<=0)
            {
                map.setWorld("@",p1.getRow(),p1.getCol());
                map.printWorld();
                System.out.println("Your fatigue is "+p1.getFatigue()); 
                System.out.println("Your health is "+p1.getHealth());
                System.out.print("YOU COLLAPSE ON THE GROUND AND FIND YOURSELF CONSUMED BY HELL! GAME OVER!!");
            }
        }
        else
        {
            System.out.print('\u000C');
            main(null);
        }
    }
}

