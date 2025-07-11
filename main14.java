
	// Online Free Java compiler to run Java program online
	//Take n as input and print the sum of numbers from 1 to n.
	public class Main {
		public static void main(String[] args) {

			int n=20;
			int sum=0;
			for(int i=1; i<=n;i++){
				sum += i;
			}

			System.out.println("Sum from 1 to " +n+" is: "+sum);
		}
	}