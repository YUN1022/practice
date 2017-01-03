package circle;

public class Circle {
	
	private static final double PI=3.14159;
	
	public static double getArea(double radius){
		double area;
		area=PI*radius*radius;
		return area;
	}
	
	public static double getCircleference(double radius){
		double circumference=PI*2*radius;
		return circumference;
	}
}
