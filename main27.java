
// Online Free Java compiler to run Java program online
/*
Replace all spaces in a string with hyphens (-) and print the result.
Split a sentence into words using .split(" ") and print each word on a new line.
*/
	public class Main {
		public static void main(String[] args) {
			String sentence="Java is a powerful language";
			String hyphenated = sentence.replace(" ","-");
			System.out.println("After replacing spaces with hyphens: ");
			System.out.println(hyphenated);
			System.out.println("\nWords in the sentence: ");
			String[] words=sentence.split(" ");
			for(int i=0; i<words.length;i++){
				System.out.println(words[i]);
			}
		}
	}