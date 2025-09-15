/**
* This program calculates the volume of a sphere.
*
* @author Dylan Mutabazi
* @version 1.0
* @since 2025-September-11
*/
// import Scanner for user input 
import java.util.Scanner;

final class VolSphere {
    /**
    *@exception IllegalStateException
    *@see IllegalStateException
    */
    private VolSphere() {
        throw new IllegalStateException("Utility class");
    }
    /**
    * Entrypoint of the program.
    * @param args UNUSED.
    */
    public static void main(final String[] args) {
        // Ask user for radius of sphere
        System.out.print("What is your radius: ");
        final Scanner radius = new Scanner(System.in);
        final double radiusDouble = radius.nextDouble();
        
        // If the radius is = or less than 0 it prints error and tells user to try again
        if (radiusDouble <= 0) {
            System.out.println("Invalid input, try again.");
            // Else prints volume of sphere
        } else {
            final double volume = (4.0 / 3.0) * (Math.PI * Math.pow(radiusDouble, 3));
            System.out.println("The volume of your sphere = " + String.format("%.3f", volume));
        }
    }
}
