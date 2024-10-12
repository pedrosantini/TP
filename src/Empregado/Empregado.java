package Empregado;

public class Empregado {
	private String nome;
	private String sobrenome;
	private double salario;

	public Empregado() {
	}

	public Empregado(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario > 0)
			this.salario = salario;
		else
			this.salario = 0;
	}

}
