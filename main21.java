
// Online Free Java compiler to run Java program online
//Create an abstract class Shape with an abstract method area(). Derive Circle and Rectangle classes and implement area() for each. Create an interface Playable with a method play(). Implement it in a Guitar and Drum class and call play() on both.
abstract class Shape{
	abstract void area();
}
class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	void area(){
		double area=Math.PI*radius*radius;
		System.out.println("Area of Circle: " + area);
	}
}
class Rectangle extends Shape{
	double length,width;
	Rectangle(double length, double width){
		this.length=length;
		this.width=width;
	}
	void area(){
		double area=length*width;
		System.out.println("Area of Rectangle: "+area);
	}
}
interface Playable{
	void play();
}
class Guitar implements Playable{
	public void play(){
		System.out.println("Playing the guitar");
	}
}
class Drum implements Playable{
	public void play(){
		System.out.println("Playing the drum");
	}
}
	public class Main {
		public static void main(String[] args) {
			Shape circle = new Circle(5.0);
			Shape rectangle = new Rectangle(4.0,8.0);
			circle.area();
			rectangle.area();
			Playable guitar = new Guitar();
			Playable drum = new Drum();
			guitar.play();
			drum.play();
		
		}
	}