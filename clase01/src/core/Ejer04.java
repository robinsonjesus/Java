package core;

public class Ejer04 
{
    public static void main(String[] args) 
    {
    	int vbleA;

    	for (;;)  
    	{
    		if (vbleA<0) 
    		{
    			System.out.println("murió en madrid");
    			break;
    		}
    		System.out.println(vbleA);
    		vbleA = vbleA  +  1;
        }
    }
}