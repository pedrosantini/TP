package Fatura;

public class Fatura {
	private String cod;
    private String descricao;
    private int qtd;
    private double preco;

    public Fatura(){
    }
    
    public Fatura(String c, String d, int q, double p){
        this.cod = c;
        this.descricao = d;
        this.qtd = q;
        this.preco = p;
    }
    public void setCodigo(String c){
        this.cod = c;
    }
    public void setDescricao(String d){
        this.descricao = d;
    }
    public void setQuantidade(int q){
        this.qtd = q;
    }
    public void setPreco(double p){
        this.preco = p;
    }
    public String getCodigo() {
    	return this.cod;
    }
    public String getDescricao() {
    	return this.descricao;
    }
    public int getQuantidade() {
    	return this.qtd;
    }
    public double getPreco() {
    	return this.preco;
    }
    
    public double obterValorFatura() {
    	double v = this.preco *this.qtd;
    	if(v > 0)
    		return v;
    	return 0;
    }    

}
