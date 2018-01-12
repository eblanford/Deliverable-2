package preWork;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Deliverable2 {
	public static void main(String[] args) {
		// Scanner
		Scanner scnr = new Scanner(System.in);

		// Prompts user, stores as a string, and converts to LocalDate type
		System.out.println("Enter a date in the following format: \nYYYY-MM-DD");
		String userDate1s = scnr.next();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate userDate1 = LocalDate.parse(userDate1s, formatter);

		// Collects & converts second date
		System.out.println("Enter another date in the following format: \nYYYY-MM-DD");
		String userDate2s = scnr.next();
		LocalDate userDate2 = LocalDate.parse(userDate2s, formatter);

		// Uses Period to calculate the difference between the two dates
		Period p = Period.between(userDate1, userDate2);

		// Outputs the date difference
		System.out.println("These dates are " + Math.abs(p.getDays()) + " day(s), " + Math.abs(p.getMonths())
				+ " month(s), and " + Math.abs(p.getYears()) + " year(s) apart");

		// Closes scanner to remove warning
		scnr.close();
	}

}
