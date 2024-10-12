package Rational;


public class Rational {
	private int numerator;
	private int denominator;

	public Rational(int n, int d) {
		this.numerator = n;
		this.denominator = d;
		this.reduzir();
	}
	
	public Rational() {
		this.denominator = 1;
	}
	
	public void reduzir() {
		int c = mdc_it(this.numerator, this.denominator);
		
		this.numerator = this.numerator/c;
		this.denominator = this.denominator/c;
		
		if(this.denominator < 0) {
			this.numerator = -1*this.numerator;
			this.denominator = -1*this.denominator;
		}
	}
	
	public void soma(Rational a, Rational b) {
		this.numerator = a.numerator*b.denominator + b.numerator*a.denominator;
		this.denominator = a.denominator*b.denominator;
		
		this.reduzir();
	}
	
	public void subtrai(Rational a, Rational b) {
		this.numerator = a.numerator*b.denominator - b.numerator*a.denominator;
		this.denominator = a.denominator*b.denominator;
		
		this.reduzir();
	}
	
	public void multiplica(Rational a, Rational b) {
		this.numerator = a.numerator * b.numerator;
		this.denominator = a.denominator * b.denominator;
		
		this.reduzir();
	}
	
	public void divide(Rational a, Rational b) {
		this.numerator = a.numerator * b.denominator;
		this.denominator = a.denominator * b.numerator;
		
		this.reduzir();
	}
	
	public void imprimirRat() {
		System.out.println(this.numerator+"/"+this.denominator);
	}
	
	public void imprimirFloat() {
		double n = (double)this.numerator/(double)this.denominator;
		
		System.out.printf("%.2f\n", n);
	}
	
	
	public int mdc_it(int a, int b){
	    int c;

	    while (b != 0){
	        c = b;
	        b = a % b;
	        a = c;
	    }

	    return a;
	}
	
	

}
