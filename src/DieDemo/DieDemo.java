package DieDemo;

public class DieDemo{
	public static void main(String[] args) {
		Die d1 = new Die();
		Die d2 = new Die();
		
		System.out.println("O dado d1 caiu com o valor "+ 
		d1.getSideUp()+" para cima!");
		System.out.println("O dado d2 caiu com o valor "+ 
		d2.getSideUp()+" para cima!");
		
		System.out.println("Rolando os dados....");
		d1.roll();
		d2.roll();
		System.out.println("d1: "+ d1.getSideUp());
		System.out.println("d2: "+ d2.getSideUp());		
	}
}