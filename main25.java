
// Online Free Java compiler to run Java program online
/*
Create an enum Day with constants for all 7 days. Write a program that takes a day name as input and prints a custom message for that day.
Demonstrate auto-boxing and unboxing using Integer and Double wrapper classes. Add two Integer objects and print the result.
*/
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
enum Day{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//String input = sc.nextLine().toUpperCase();
		try{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();
			if (input == null || input.trim().isEmpty()) {
        		System.out.println("No input provided.");
                	return;
        	}
			Day day=Day.valueOf(input.trim().toUpperCase());
			switch(day){
				case MONDAY:
				System.out.println("Start of the work week!");
				break;
				case TUESDAY:
				System.out.println("It's only Tuesday");
				break;
				case WEDNESDAY:
				System.out.println("Midweek hustle!");
				break;
				case THURSDAY:
				System.out.println("Almost there");
				break;
				case SUNDAY:
				System.out.println("Recharge for the week ahead.");
				break;
			} 
			Integer num1=100;
			Integer num2=200;
			int sum = num1+num2;
			System.out.println("Sum of two Integer objects: "+sum);
			Double d1=12.5;
			Double d2=7.5;
			double total=d1+d2;
			System.out.println("Sum of two Double objects: "+total);
			} catch(IllegalArgumentException e){
			System.out.println("Invalid day entered.");
		} catch(IOException e){
			System.out.println("Error reading input.");
		}
	}
}