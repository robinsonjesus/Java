package core;

public interface FractionService {

	int getNumerator();

	int getDenominator();

	// 5/3  *  4/7 =  20/21
	Fraction product(Fraction other);

	//Ej: 5/3  *  3  devuelve  15/3
	Fraction product(int number);

}