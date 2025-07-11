
	// Online Free Java compiler to run Java program online
	//Write a program that checks whether a number is prime or not using a loop.
	public class Main {
		public static void main(String[] args) {
			int n=7;
			boolean isPrime=true;
			if(n<2){
				isPrime=false;
			} else{
				for(int i=2;i<=Math.sqrt(n);i++){
					if(n%i==0){
						isPrime=false;
						break;
					}
				}
			}
			if(isPrime){

				System.out.println(n+" is not prime number");
			} else{
				System.out.println(n+" is prime number");
			}
		}
	}