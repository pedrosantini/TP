package NumComplexo;

public class UsaComplexo{
	public static void main(String[] args) {
		Complexo c1 = new Complexo();
		Complexo c2 = new Complexo(1, 2);
		
		c1.imprimeNumero();
		c2.imprimeNumero();
		
		c1.inicializaNumero(3, 2);
		
		c1.imprimeNumero();
		
		System.out.println(c1.eIgual(c2));
		
		Complexo c3 = new Complexo(1, 2);
		
		System.out.println(c2.eIgual(c3));
		
		Complexo soma = new Complexo();
		
		soma = c1.soma(c2);
		
		
		soma.imprimeNumero();
		
		Complexo subtracao = new Complexo();
		
		subtracao = c1.subtrai(c2);
		
		
		subtracao.imprimeNumero();
		
		Complexo multiplicacao = new Complexo();
		
		multiplicacao = c1.multiplica(c2);
		
		
		multiplicacao.imprimeNumero();
		
		
		
		
		
		
		
	}
	
	
}