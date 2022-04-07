package geom;

public class Point3D  implements  Point3DService
{
    private int x;
    private int y;
    private int z;

    public  Point3D(int myX, int myY, int myZ)
   {  x= myX;   y= myY;   z= myZ; }

    public double distance(Point3DService other)
   {    return 
		   
		   Math.sqrt( 
				   
				   Math.pow(x - other.getX(), 2) +
				   
				   Math.pow(z - other.getZ(), 2) );      
   
   }
    
    
    public int getX()
    {   return x;     }
    
    public int getY()
    {   return y;     }
    
    public int getZ()
    {   return z;     }
}