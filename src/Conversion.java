 public class Conversion {

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        // Feet to Meters Table
        System.out.println("Feet   Meters");
        for (int feet = 1; feet <= 10; feet++) {
            System.out.printf("%-6.1f%-8.3f%n", (double) feet, footToMeter(feet));
        }

        System.out.println(); // Spacer between tables

        // Meters to Feet Table
        System.out.println("Meters   Feet");
        for (int meters = 20; meters <= 65; meters += 5) {
            System.out.printf("%-8.1f%-8.3f%n", (double) meters, meterToFoot(meters));
        }
    }
}

