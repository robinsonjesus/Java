package geom;

public class Line3D implements Line3DService 
{
	
	private Point3D origin;
	private Point3D target;
	
	public Line3D (Point3D myOrigin, Point3D myTarget)
	
	{
		origin = myOrigin;
		target = myTarget;
	}
	
	@Override
	public double lenght()
	
	{
		return origin.distance(target);
	}

}