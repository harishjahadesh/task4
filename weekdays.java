package task4;

import java.util.Scanner;

public class weekdays {
	public static void main(String[] args) {
		String [] weekdays = {"sunday", "monday", "tuesday", "wednesday", "turesday", "friday", "saturday"};
	Scanner Scanner = new Scanner(System.in);
	System.out.println("Enter the day position (0-6) : ");
	int dayposition = Scanner.nextInt();
	try {
		 String dayName = weekdays[dayposition];
         System.out.println("The day at position " + dayposition + " is: " + dayName);
	} catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Error: Index out of bounds. Please enter a day position between 0 and 6.");
    }

    Scanner.close();
	}

}
