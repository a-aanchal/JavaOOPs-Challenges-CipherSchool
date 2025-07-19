
// Online Free Java compiler to run Java program online
/*
Take a string input and print its: Length, First and last characters and it's Uppercase version
Take two strings and concatenate them with a space in between using + and concat().
*/
import java.util.Scanner;
	public class Main {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String input = sc.nextLine();
			System.out.println("Length: "+input.length());
        	if (!input.isEmpty()) {
            		System.out.println("First character: " + input.charAt(0));
            		System.out.println("Last character: " + input.charAt(input.length() - 1));
        	} else {
            		System.out.println("String is empty!");
        	}

        	System.out.println("Uppercase: " + input.toUpperCase());
        	String str1 = sc.nextLine();
        	String str2 = sc.nextLine();


        	String combinedPlus = str1 + " " + str2;
        	System.out.println("Concatenated using + : " + combinedPlus);


        	String combinedConcat = str1.concat(" ").concat(str2);
        	System.out.println("Concatenated using concat(): " + combinedConcat);
			
		}
	}



 
