/**
*
* Two climbers navigate a mountain to bring treasure back to base
* 
* @author <Stefan Chao>
* @version <24/Nov/2014>
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;



public class Lab03 {

     public static void main(String[] args) {
    	  Display.openWorld("maps/mountain.map");
   	   Display.setSize(16,16);
   	   Display.setSpeed(12);
   	   
   	   Climber maria = new Climber(8);
   	   maria.turnRight();
   	   maria.move();
   	   maria.climbUpRight();
   	   maria.climbUpRight();
   	   maria.climbUpRight();
   	   maria.move();
   	   maria.climbDownRight();
   	   maria.climbDownRight();
   	   maria.turnAround();
   	   maria.move();
   	   maria.pickBeeper();
   	   maria.climbUpLeft();
   	   maria.climbUpLeft();
   	   maria.move();
   	   maria.climbDownLeft();
   	   maria.climbDownLeft();
   	   maria.climbDownLeft();
   	   
     }
     }
