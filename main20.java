
// Online Free Java compiler to run Java program online
//Create a class Outer with a nested class Inner. From the main() method, create an object of the Inner class and call a method from it.Make the Inner class private. Add a method in Outer that returns the result of calling a method from Inner.

	public class Main {
		public static void main(String[] args) {
       			Outer outer = new Outer();
        		String message = outer.getInnerMessage();
			System.out.println(message);
		}
	}
	class Outer{
		private class Inner{
			public String displayMessage(){
				return "Hello from Inner class!";
			}
		}
		public String getInnerMessage(){
			Inner inner=new Inner();
			return inner.displayMessage();
		}
	}




