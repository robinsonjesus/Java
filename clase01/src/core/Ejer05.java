package core;

public class Ejer05 
{
    public static void main(String[] args) 
    {
    	int vbleA = Integer.MAX_VALUE;

    	for (;;)  
    	{
    		if (vbleA<0) 
    		{
    			System.out.println("murió en madrid");
    			break;
    		}
    		System.out.println(vbleA);
    		vbleA  +  1;
        }
    }
}