
// Online Free Java compiler to run Java program online
/*
Take a string and print each character on a new line using a loop.
Check whether a string is a palindrome (e.g., “madam”).
*/
import java.util.Scanner;
	public class Main {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			System.out.println("\nCharacter in the string: ");
			for(int i=0; i<str.length(); i++){
				System.out.println(str.charAt(i));
			}
			String reversed="";
			for(int i=str.length() -1; i>=0; i--){
				reversed += str.charAt(i);
			}
			if(str.equals(reversed)){
				System.out.println("\nThe string is a palindrome.");
			}else{
				System.out.println("\nThe string is not a palindrome.");
			}
			
		}
	}



