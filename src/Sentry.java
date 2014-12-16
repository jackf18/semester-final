import org.asl.karelx.Uberbot;

/**
 * Patrols an area defined by four beepers.
 * 
 */
public class Sentry extends Uberbot {
   
   public Sentry() {
      super(1,1, Display.NORTH, Display. INFINITY);
   }
   public Sentry(int x, int y, int dir, int beep) {
       super(x, y, dir, beep);
   }

	/**
	 * Patrol an area in a clockwise direction.  
	 * 
	 * Move forward until next to a beeper then turn right.  Repeat indefinitely.
	 *
	 */
	public void patrol() {
		while (nextToABeeper()) {
         turnRight();
         move();  
	   }
      while (!nextToABeeper()) {
         move();
      }
   }
}   
