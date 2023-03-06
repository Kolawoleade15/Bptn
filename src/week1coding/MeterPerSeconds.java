package week1coding;

import java.util.Scanner;
public class MeterPerSeconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        double distance = scanner.nextDouble();
        System.out.print("Input hour: ");
        double hour = scanner.nextDouble();
        System.out.print("Input minutes: ");
        double minutes = scanner.nextDouble();
        System.out.print("Input seconds: ");
        double seconds = scanner.nextDouble();
        
        double totalSeconds = (hour * 3600) + (minutes * 60) + seconds;
        double metersPerSecond = distance / totalSeconds;
        double kilometersPerHour = (distance / 1000.0) / (totalSeconds/3600);
         double milesPerHour = (distance / 1609.0) / (totalSeconds / 3600.0);

        System.out.println("Your speed in meters/second is " + metersPerSecond);
        System.out.println("Your speed in km/h is " + kilometersPerHour);
        System.out.println("Your speed in miles/h " + milesPerHour);

        scanner.close();
    }
}