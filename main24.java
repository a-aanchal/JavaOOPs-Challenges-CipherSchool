
// Online Free Java compiler to run Java program online
/*
Create a Laptop class with brand, model, and price as fields. Instantiate two objects and display their details.
Write a program to compare the price of two Laptop objects and print which one is more expensive.
*/
class Laptop{
	String brand;
	String model;
	double price;
	Laptop(String brand, String model, double price){
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	void display(){
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+ price);
		System.out.println();
	}
}
public class Main {
	public static void main(String[] args) {
		Laptop lap1=new Laptop("Dell","Inspiro 15",55000.00);
		Laptop lap2=new Laptop("HP","Pavilion x360",62000.00);
		System.out.println("Laptop 1 Details: ");
		lap1.display();
		System.out.println("Laptop 2 Details: ");
		lap2.display();
		if(lap1.price>lap2.price){
			System.out.println("Laptop1 is more expensive.");
		} else if(lap2.price>lap1.price){
			System.out.println("Laptop2 is more expensive.");
		}else{
			System.out.println("Both laptops have the same price.");
		}
		
		}
	}