
// Online Free Java compiler to run Java program online
//Create a Book class with a parameterized constructor. Create two objects using the constructor and display their data.
//Use encapsulation: create a Student class with private fields and public getter/setter methods. Demonstrate their usage in the main() method.
class Book{
	String title;
	String author;
	double price;
	Book(String title, String author, double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void display(){
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
		System.out.println();
	}
}
class Student{
	private String name;
	private int roll;
	private char grade;
	public void setName(String name){
		this.name=name;
	}
	public void setRoll(int roll){
		this.roll=roll;
	}
	public void setGrade(char grade){
		this.grade=grade;
	}
	public String getName(){
		return name;
	}
	public int getRoll(){
		return roll;
	}
	public char getGrade(){
		return grade;
	}
}
	public class Main {
		public static void main(String[] args) {
			Book book1=new Book("Animal Farm","George Orwell",599.0);
			Book book2=new Book("The Stranger","Albert Camus",499.0);
			book1.display();
			book2.display();
			Student student = new Student();
			student.setName("Anchal kumari");
			student.setRoll(25);
			student.setGrade('A');
			System.out.println("Student Name: "+student.getName());
			System.out.println("Roll Number: "+ student.getRoll());
			System.out.println("Grade: "+student.getGrade());
		}
	}