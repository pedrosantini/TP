package Empregado;

public class UsaEmpregado {
	public static void main(String[] args) {
		Empregado e1 = new Empregado();
		Empregado e2 = new Empregado("Gilvanio", "da Silva", 2000);

		e1.setNome("Wesley");
		e1.setSobrenome("Souza");
		e1.setSalario(3000);

		System.out.println(e1.getSalario());
		System.out.println(e2.getSalario());
		
		System.out.println(e1.getNome()+" "+e1.getSobrenome());
		System.out.println(e2.getNome()+" "+e2.getSobrenome());
		
		System.out.println("O salario anual de "+e1.getNome()+" "+e1.getSobrenome()+"eh de R$"+(e1.getSalario()*12));
		System.out.println("O salario anual de "+e2.getNome()+" "+e2.getSobrenome()+"eh de R$"+(e2.getSalario()*12));
		
		e1.setSalario(e1.getSalario()*1.1);
		System.out.println(e1.getSalario());
		e2.setSalario(e2.getSalario()*1.1);
		System.out.println(e2.getSalario());
		
		System.out.println(e1.getSalario()*12);
		System.out.println(e2.getSalario()*12);

	}
}
