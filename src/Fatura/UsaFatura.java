package Fatura;

public class UsaFatura {

	public static void main(String[] args) {
		Fatura f1 = new Fatura();
		Fatura f2 = new Fatura("15225", "parafuso 10mm", 4, 3.50);

		System.out.println(f1.obterValorFatura());
		System.out.println(f2.obterValorFatura());

		f1.setCodigo("10224");
		f1.setDescricao("martelo pequeno");
		f1.setPreco(35);
		f1.setQuantidade(2);

		System.out.println("O codigo do item da fatura f1 eh: " + f1.getCodigo());
		System.out.println("O codigo do item da fatura f1 eh: " + f1.getCodigo());

		System.out.println("A descricao do item da fatura f1 eh: " + f1.getDescricao());
		System.out.println("A descricao do item da fatura f1 eh: " + f2.getDescricao());

		System.out.println("O preco do item da fatura f1 eh: " + f1.getPreco());
		System.out.println("O preco do item da fatura f1 eh: " + f2.getPreco());
		

		System.out.println("A quantidade do item da fatura f1 eh: " + f1.getQuantidade());
		System.out.println("A quantidade do item da fatura f1 eh: " + f2.getQuantidade());
		
		System.out.println(f1.obterValorFatura());
		System.out.println(f2.obterValorFatura());
		
		
		
	}

}
