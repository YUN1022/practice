package circle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		
		double radius=keyboard.nextDouble();
		
		double area=Circle.getArea(radius);
		double circumference=Circle.getCircleference(radius);
		
		System.out.println("radius: " + radius + "; area:" + area);
		System.out.println("radius: " + radius + "; circumference:" + circumference);

		keyboard.close();
	}

}
