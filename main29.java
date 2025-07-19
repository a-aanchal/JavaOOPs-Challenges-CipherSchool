
// Online Free Java compiler to run Java program online
/*
Overload a method multiply() that multiplies two integers or two doubles.
Create an overloaded greet() method — one with no arguments and one with a name argument.


*/
	public class Main {
		public static int multiply(int a, int b){
			return a*b;
		}
		public static double multiply(double a, double b){
			return a*b;
		}
		public static void greet(){
			System.out.println("Hello!");
		}
		public static void greet(String name){
			System.out.println("Hello, "+name+"!");
		}
		public static void main(String[] args) {
			System.out.println("Multiplying integers: "+ multiply(4,5));
			System.out.println("Multiplying doubles: "+ multiply(3.2,2.5));
			greet();
			greet("Anchal kumari");
		}
	}