/**
 * Read and implement all of the TODO items in the main method, below.
 * 
 */
import org.asl.karelx.Squarebot;

public class TestChallenge1 {
	// TODO Complete the provided Sentry class by implementing its patrol() method

	public static void main(String[] args) {

		Squarebot square = new Squarebot (9, 3);
      Sentry jack = new Sentry (4, 4);

      square.layCorners(5);
      jack.patrol();
	
     
		// TODO Create a Sentry and have it patrol clockwise around the beepers, indefinitely
      
	}

}
