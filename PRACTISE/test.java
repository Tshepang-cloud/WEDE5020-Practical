import java.util.Scanner;

public class RoadAccidentReport {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // City names
        String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};

        // Vehicle types
        String[] vehicles = {"Car", "Motorbike"};

        // 2D array: rows = cities, columns = vehicle types
        int[][] accidentData = new int[3][2];

        // Prompt user to input accident data
        System.out.println("🚧 Enter road accident data for each city:");
        for (int i = 0; i < cities.length; i++) {
            System.out.println("City: " + cities[i]);
            for (int j = 0; j < vehicles.length; j++) {
                System.out.print("Enter number of " + vehicles[j] + " accidents: ");
                accidentData[i][j] = input.nextInt();
            }
            System.out.println();
        }

        // Display report header
        System.out.println("📊 Road Accident Report");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "City", "Car", "Motorbike", "Total");

        // Calculate totals and find city with highest accidents
        int maxAccidents = 0;
        String worstCity = "";
        for (int i = 0; i < cities.length; i++) {
            int total = accidentData[i][0] + accidentData[i][1];
            System.out.printf("%-15s %-10d %-10d %-10d\n",
                    cities[i], accidentData[i][0], accidentData[i][1], total);

            if (total > maxAccidents) {
                maxAccidents = total;
                worstCity = cities[i];
            }
        }

        // Display city with highest accidents
        System.out.println("--------------------------------------------------");
        System.out.println(" City with the highest number of accidents: " + worstCity);
    }
}
