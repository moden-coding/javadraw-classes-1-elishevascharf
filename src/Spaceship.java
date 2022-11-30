import java.util.ArrayList;
import javadraw.*;
/** Video 1: Overview of our plan - https://www.youtube.com/watch?v=LTHNYZ7RZNU&list=PLpkMWkvwtatg_BHn3tb3FsXklJz4EurHH&index=7
 *  Video 2: Creating variables/constructors - https://www.youtube.com/watch?v=gleqYdOr_Fo
 * 
 *  Task: 
 *  Create a Spaceship that:
 *  -has health variable
 *  -has a shape (stored in ArrayList)
 *  -has speed variable
 *  -has direction variable
 * 
 *  With constructors:
 *  1. Creates Spaceship with default values for health (10), shape (two Ovals), speed (5)
 * 
 *  2. Creates Spaceship where health and speed are passed in as parameters
 *
 */

public class Spaceship {
    private int health;
    private ArrayList <Oval> ship;
    private int speed;
    private int direction; 
    private Screen screen;

    public Spaceship(Screen sc, Location loc) {
        health = 10;
        speed = 5;
        direction = 1;
        screen = sc;
        ship = new ArrayList<Oval>();
        Oval pilot = new Oval(screen, loc, 35, 35, Color.random());
        Oval body = new Oval(screen, 30, 100, 100, 30, Color.random());
        body.center(pilot.center().x(), pilot.center().y()+20);
        ship.add(pilot);
        ship.add(body);
    }

    public Spaceship(Screen sc, int h, int s, Location loc) {
        health = h;
        speed = s;
        direction = 1;
        screen = sc;
        ship = new ArrayList<Oval>();
        Oval pilot = new Oval(screen, loc, 35, 35, Color.random());
        Oval body = new Oval(screen, 30, 100, 100, 30, Color.random());
        body.center(pilot.center().x(), pilot.center().y()+20);
        ship.add(pilot);
        ship.add(body);
    }

    


}

