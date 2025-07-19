
// Online Free Java compiler to run Java program online
//Create a Person class with name and age, and a derived Employee class with employee ID and salary. Create an Employeeobject and print all details. Create a Vehicle base class with a start() method. Inherit Car and Bike classes, each overriding start(). Call start()on both.
class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
}
class Employee extends Person{
	String employeeId;
	double salary;
	Employee(String name, int age, String employeeId, double salary){
		super(name, age);
		this.employeeId=employeeId;
		this.salary=salary;
	}
	void printDetails(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Employee ID: "+employeeId);
		System.out.println("Salary: "+ salary);
	}
}
class Vehicle{
	void start(){
		System.out.println("vehicle is starting");
	}
}
class Car extends Vehicle{
	void start(){
		System.out.println("Car is starting with key ignition.");
	}
}
class Bike extends Vehicle{
	void start(){
		System.out.println("Bike is starting with kick start.");
	}
}
	public class Main {
		public static void main(String[] args) {
			Employee emp = new Employee("Anchal",20,"EMP123",500000.00);
			emp.printDetails();
			Vehicle myCar=new Car();
			Vehicle myBike=new Bike();
			myCar.start();
			myBike.start();
		}
	}