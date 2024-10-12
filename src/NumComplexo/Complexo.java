package NumComplexo;

public class Complexo{
	private double real;
	private double img;
	
	public Complexo(double r, double i) {
		this.real = r;
		this.img = i;
	}
	
	public Complexo() {
		this.real = 0;
		this.img = 0;
		
	}
	
	public void inicializaNumero(double r, double i){
		this.real = r;
		this.img = i;
	}
	
	public void imprimeNumero() {
		System.out.println(this.real + " + " + this.img + "i");
	}
	
	public boolean eIgual(Complexo x) {
		if(this.real == x.real)
			if(this.img == x.img)
				return true;
		
		return false;		
	}
	
	public Complexo soma(Complexo x) {
		Complexo soma = new Complexo();
		
		soma.inicializaNumero(this.real+x.real, this.img+x.img);
		
		return soma;
	}
	
	public Complexo subtrai(Complexo x) {
		Complexo subtracao = new Complexo();
		
		subtracao.inicializaNumero(this.real-x.real, this.img-x.img);
		
		return subtracao;
	}
	
	public Complexo multiplica(Complexo x) {
		Complexo multiplicacao = new Complexo();
		
		multiplicacao.inicializaNumero(this.real*x.real-this.img*x.img, 
				this.real*x.img+this.img*x.real);
		
		return multiplicacao;
	}
	
	
	
}