package pitsol_training;

import java.util.Scanner;

public class AreaCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Area Calculator App.");
		System.out.println("1. For Triangle\n2. For Rectangle\n3. For Square\n4. For Circle");
		System.out.println("Enter your choice :");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1: System.out.println("Enter the width of the triangle:");
					double width=sc.nextDouble();
					System.out.println("Enter the height of the triangle:");
					double height=sc.nextDouble();
					System.out.println("Area of Triangle is :"+triangleArea(width,height));
					break;
					
			case 2:	System.out.println("Enter the width of the rectangle:");
					double width_rect=sc.nextDouble();
					System.out.println("Enter the height of the rectangle:");
					double height_rect=sc.nextDouble();
					System.out.println("Area of Rectangle is :"+rectangleArea(width_rect,height_rect));
					break;
					
			case 3:	System.out.println("Enter the width of the square:");
					double width_square=sc.nextDouble();
					System.out.println("Area of Square is :"+squareArea(width_square));
					break;
					
			case 4:	System.out.println("Enter the radius of the circle:");
					double radius=sc.nextDouble();
					System.out.println("Area of Square is :"+circleArea(radius));
					break;
		}
	}

	private static double circleArea(double rad) 
	{
		double area=(double)(3.14*rad*rad);
		return area;
	}

	private static double squareArea(double width)
	{
		double area=(double)(width*width);
		return area;
	}

	private static double rectangleArea(double width, double height)
	{
		double area=(double)(height*width);
		return area;
	}

	private static double triangleArea(double width, double height) 
	{
		double area=(double)(0.5*height*width);
		return area;
	}
}
