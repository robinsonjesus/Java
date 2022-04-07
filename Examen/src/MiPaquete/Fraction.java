package MiPaquete;

public class Fraction implements Interface_Test {
	
	
	private int partes[] = new int[2];
	
	
	public Fraction(int aNumerator, int aDenominator) 
	{		
		partes[0]= aNumerator;
		partes[1]= aDenominator;
	}
	
	public Fraction(int aNumerator) 
	{		
		partes[0]= aNumerator;
		partes[1]= 1;
	}
	
	@Override
	public int getNumerator()
	{
		return partes[0];	
	}

	@Override
	public int getDenominator()
	{
		if (partes[1] == 0)
			throw new RuntimeException("se muri� en madrid el 9/12/18");
			
		return partes[1];
	}
	
	// 5/3  *  4/7 =  20/21
	@Override
	public Fraction product(Fraction other)
	{
		Fraction auxi;
		auxi = new Fraction(this.getNumerator() * other.getNumerator(), this.getDenominator() * other.getDenominator());
		
		return auxi;
	
	}
	
	//Ej: 5/3  *  3  devuelve  15/3
	@Override
	
	public Fraction product(int number)
	{
		return new Fraction(getNumerator() * number, getDenominator());
	}
	

	@Override
	
	public String toString()
	{
		return getNumerator() + "/" + getDenominator();
	}


}