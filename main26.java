
// Online Free Java compiler to run Java program online
/*Create a method countWords(String sentence) that returns the number of words.
Create a method reverseString(String s) that returns the reversed version of the string.
*/
	public class Main {
		public static int countWords(String sentence){
			if(sentence==null || sentence.trim().isEmpty()){
				return 0;
			}
			String[] words = sentence.trim().split("\\s+");
			return words.length;
		}
		public static String reverseString(String s){
			if(s==null){
				return null;
			}
			String reversed="";
			for(int i=s.length() -1; i>=0; i--){
				reversed += s.charAt(i);
			}
			return reversed;
		}
		public static void main(String[] args) {
			String sentence = "Hello Java Programming";
			int wordCount=countWords(sentence);
			String reversedSentence=reverseString(sentence);
			System.out.println("Original Sentence: "+sentence);
			System.out.println("Word Count: "+wordCount);
			System.out.println("Reversed Sentence: "+reversedSentence);
			
		}
	}