
	// Online Free Java compiler to run Java program online
	//Convert a float to an integer and print both values. Then convert an integer to a double and print both.
	//Typeconersion
	public class Main {
		public static void main(String[] args) {
			float floatValue=3.74f;
			int intValue=(int) floatValue;
			System.out.println("Original Float Value: "+floatValue);
			System.out.println("Converted to Integer: "+intValue);
			double DoubleValue=intValue;
			System.out.println("Converted to double: "+DoubleValue);
		}
	}