
// Online Free Java compiler to run Java program online
//Use the Scanner class to take user input for name, age, and favorite color. Print them in a formatted output. Use BufferedReader to read a line from the user and print the number of words in it.
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String color = sc.nextLine();
        System.out.printf("Name: %s\n", name);
	System.out.printf("Age: %d\n",age);
	System.out.printf("color: %s\n",color);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            String[] words = line.trim().split("\\s+");
            System.out.println("Number of words: " + words.length);
        }
        
    }
}
