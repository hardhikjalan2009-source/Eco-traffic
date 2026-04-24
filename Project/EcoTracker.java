import java.util.Scanner;

public class EcoTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Arrays to store our data
        double[] distances = new double[10];
        double[] savings = new double[10];
        double totalSaved = 0;

        System.out.println("--- Novus Code Clash: Green-Commute Tracker ---");

        // LOOP 1: Inputting Data
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter km for Student " + (i + 1) + ": ");
            distances[i] = sc.nextDouble();
            
            // Core Logic: 0.2kg saved per km
            savings[i] = distances[i] * 0.2;
            totalSaved += savings[i];
        }

        // LOOP 2: Finding the "Eco-Champion" (Max Value)
        double maxSaving = savings[0];
        int championIndex = 0;

        for (int i = 1; i < 10; i++) {
            if (savings[i] > maxSaving) {
                maxSaving = savings[i];
                championIndex = i;
            }
        }

        // OUTPUT: The Professional Pitch Summary
        System.out.println("\n========================================");
        System.out.println("FINAL ENVIRONMENTAL IMPACT REPORT");
        System.out.println("========================================");
        System.out.println("Total CO2 Saved by School: " + totalSaved + " kg");
        System.out.println("Eco-Champion: Student " + (championIndex + 1));
        System.out.println("Champion Savings: " + maxSaving + " kg");
        System.out.println("========================================");
    }
}