package core;

public class Ejer06 
{
    public static void main(String[] args) 
    {
    	int vbleA= Integer.MAX_VALUE;

    	for (;;)  
    	{
    		if (vbleA<0) 
    		{
    			System.out.println("muri� en madrid");
    			break;
    		}
    		System.out.println(vbleA);
    		System.out.println(vbleA +1);
        }
    }
}