package Rational;

public class UsaRational {

	public static void main(String[] args) {
		Rational n1 = new Rational(6, 8);
		Rational n2 = new Rational(3, 2);
		
		Rational n3 = new Rational();
		
		
		n1.imprimirRat();
		n1.imprimirFloat();
		n2.imprimirRat();
		n2.imprimirFloat();
		
		n3.soma(n1, n2);
		
		n3.imprimirRat();
		n3.imprimirFloat();
		
		n3.subtrai(n1, n2);
		
		n3.imprimirRat();
		n3.imprimirFloat();
		
		n3.multiplica(n1, n2);
		
		n3.imprimirRat();
		n3.imprimirFloat();
		
		n3.divide(n1, n2);
		
		n3.imprimirRat();
		n3.imprimirFloat();
		
		
		
		
		
			
		
	}

}
