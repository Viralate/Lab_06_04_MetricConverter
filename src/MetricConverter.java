import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {
        //initate scanner
        Scanner scanner = new Scanner(System.in);
        double meters;

        // Prompt for a valid measurement in meters
        while (true) {
            System.out.print("Enter a measurement in meters: ");
            meters = scanner.nextDouble();
            if (meters >= 0) {
                break;
            }
            System.out.println("Measurement must be a non-negative number.");
        }

        // Conversion factors
        double metersToMiles = 0.000621371;
        double metersToFeet = 3.28084;
        double metersToInches = 39.3701;

        // Convert and display the results
        double miles = meters * metersToMiles;
        double feet = meters * metersToFeet;
        double inches = meters * metersToInches;
        //display results
        System.out.println("Measurement in miles: " + miles);
        System.out.println("Measurement in feet: " + feet);
        System.out.println("Measurement in inches: " + inches);
    }
}
