
// Online Free Java compiler to run Java program online
/*
Create a method add(int a, int b) that returns their sum. Call it with user input.
Write a method maxOfThree(int a, int b, int c) that returns the largest number.
*/
import java.util.Scanner;
	public class Main {
		public static int add(int a, int b){
			return a+b;
		}
		public static int maxOfThree(int a, int b, int c){
			int max=a;
			if(b>max) max=b;
			if(c>max) max=c;
			return max;
		}
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int sum = add(n1, n2);
			System.out.println("Sum: "+sum);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int max=maxOfThree(a,b,c);
			System.out.println("Maximum: "+max);
		}
	}