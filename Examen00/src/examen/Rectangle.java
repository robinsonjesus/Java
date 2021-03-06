package examen;

public class Rectangle extends Shape
{
	private double length;
	private double width;
	
	public Rectangle( double myLength,  double myWidth) 	{
		length= myLength;
		width= myWidth;
	}
	
	public Rectangle(double myWidth) 	{
		length= myWidth;
		width= myWidth;
	}
	
	public double getArea() 	{
	      double auxi=  length * width;

		return auxi;
	}
	
	public double getPerimeter() 	{
	      double auxi=  (length * 2) + (width * 2);

		return auxi;
	}

	public String toString() {
		
		return getClass().getCanonicalName() + 
 			", length= " + length + 
 			" width= " + width;
	}
}