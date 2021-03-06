package examen;

public class Circle extends Shape
{
	private double radius;
	
	public Circle(double myRadius) 	{
		radius= myRadius;
	}
	
	public double getArea() 	{
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() 	{
		return Math.PI * 2 * radius;
	}

    public String toString() {
		
		return getClass().getCanonicalName() + ", radius= " + radius;
	}
}