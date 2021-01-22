package chap12;
/* Westley W Williams
*  CIS 2212-800 Java I FlexPace
*  Assignment 01 - PHOTO ORDER
*  Submitted January 13th, 2021
*/
import java.util.Scanner;

public class DemoBasics {
	
	public static void main(String[] args) {
		//main purpose of assignment is to learn strings and adding
		//I need to put into string format the items the customer can buy. I store these strings in variables.
		//I needed to do a carriage return for format, so I used "\r\n"
		//I appended \t onto \r\n to get an tab for even extra formatting
		String additionalItems = "Additional items available:"
						+ "\r\n\t"
						+ "4 x 6			$ 5.00"
						+ "\r\n\t"
						+ "5 x 7			$ 7.50"
						+ "\r\n\t"
						+ "8 x 10			$ 10.00"
						+ "\r\n\t"
						+ "Button			$ 7.50"
						+ "\r\n\t"
						+ "Magnet			$ 8.00"
						+ "\r\n\t"
						+ "Picture Packet		$15.00";
		String packagesAvailable = "Packages available:"
						+ "\r\n"
						+ "Picture Packet includes 4x6, 5x7, 8x10 prints."
						+ "\r\n\t"
						+ "Picture Packet & Photo Button	$24.99"
						+ "\r\n\t"	
						+ "Picture Packet & Photo Magnet	$25.99"
						+ "\r\n\t"
						+ "Picture Packet, Button, Magnet	$29.99"
						+ "\r\n";
		String pageBreak = "* * * * * * * * * * * *"
						+ "* * * * * * * * * * * *";
		String tradeMark = "SCC Photography"
						+ "\r\n\t"
						+ "...keeping memories alive";
		//saving the total seconds from the UNIX epoch of Jan 1, 1970 GMT
		long totalSeconds = (System.currentTimeMillis())/1000;
		long totalMinutes = totalSeconds/60;
		long totalHours = totalMinutes/60;
		//%60, %60, and %24 is finding the remainder to find the current second, minute, and hour
		//I did need to type cast this, hence the (byte) declaration on the right side of the equation
		byte currentSeconds = (byte)(totalSeconds%60);	
		byte currentMinutes = (byte)(totalMinutes%60);
		byte currentHour = (byte)(totalHours%24);
		
		/*"scanner is a class in java.util package used
		for obtaining the input of the primitive types
		like int, double, etc. and strings"
		source: https://www.geeksforgeeks.org*/
		//System.in is the standard input stream
		//System.in is an object
		Scanner theScanner = new Scanner(System.in);
		//get user input for today's date
		System.out.print("Enter today's date: ");
		//todaysDate is in camelcase. I will use this for all other variables
		String todaysDate = theScanner.nextLine();
		//get customer's first name
		System.out.print("Enter your first name: ");
		String firstName = theScanner.nextLine();	
		//get customer's last name
		System.out.print("Enter your last name: ");
		String lastName = theScanner.nextLine();
		//get customer's phone number
		System.out.print("Enter your phone number: ");
		String phoneNumber = theScanner.nextLine();
		
		
		//Now, we need to print out the options available to the customer
		//this may be a long string
		//I created a string variable above to store the string
		System.out.println(packagesAvailable);
		System.out.print("Enter amount of package you would like to order: ");
		double packageAmount = theScanner.nextDouble();
		
		
		System.out.println(additionalItems);
		System.out.print("Enter additional items you would like to order: ");
		double additionalItemsAmount = theScanner.nextDouble();
		//variable pageBreak is above
		System.out.println(pageBreak);
		System.out.println(tradeMark);
		//print the order date, and time.
		System.out.println("Order date/time: " 
						+ todaysDate
						+ " "
						+ currentHour 
						+ ":" 
						+ currentMinutes 
						+ ":" 
						+ currentSeconds 
						+ " GMT");
		//Now, we want to print the first name, last name, and
		//phone number to the screen
		System.out.println("Order for " + firstName + " " + lastName);
		System.out.println("Phone: " + phoneNumber);
		System.out.println("Payment due at pickup: $" + (packageAmount + additionalItemsAmount));
		
	
		

	} //end of main

} //end of class
