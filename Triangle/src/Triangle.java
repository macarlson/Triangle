
public class Triangle extends GeometricObject {
	
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(){
		
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	public Triangle(double Side1, double Side2, double Side3){
		
		side1 = Side1;
		side2 = Side2;
		side3 = Side3;
	}
	
	public double getside1(){
		return side1;
	}
	
	public double getside2(){
		return side2;
	}
	
	public double getside3(){
		return side3;
	}
	
	public double getArea(){
		double p = getPerimeter()/2;
		return Math.sqrt(p * (p-side1) * (p-side2) * (p-side3));
		//Formula obtained from http://www.mathopenref.com/heronsformula.html
	}
	
	public double getPerimeter(){
		return (side1 + side2 + side3);
	}
	
	public String toString(){
		return "The triangle's area is " + getArea() + " and its perimeter is " + getPerimeter();
	}
	
}
