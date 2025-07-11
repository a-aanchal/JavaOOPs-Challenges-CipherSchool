
	// Online Free Java compiler to run Java program online
	//Create an array of 5 integers and print each element using a loop. Try and find the max element of this array.
	public class Main {
		public static void main(String[] args) {
			int[] n={12,26,7,28,90};
			for(int i=0;i<n.length;i++){
				System.out.println(n[i]);
			}
			int max=n[0];
			for(int i=1; i<n.length;i++){
				if(n[i]>max){
					max=n[i];
				}
			}
			System.out.println("Max number : "+max);
			
		}
		
	}