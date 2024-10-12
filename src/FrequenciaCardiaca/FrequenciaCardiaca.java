package FrequenciaCardiaca;
import java.util.Scanner;

public class FrequenciaCardiaca {
    private String nome;
    private String sobrenome;
    private Date nascimento;

    public FrequenciaCardiaca(String n, String s, int d, int m, int a) {
        this.nome = n;
        this.sobrenome = s;
        this.nascimento = new Date(d, m, a);
    }

    public FrequenciaCardiaca(){

    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void getNascimento() {
        this.nascimento.mostraData();
    }

    public int obterIdade() {
        Scanner sc = new Scanner(System.in);

        int dAt = sc.nextInt();
        int mAt = sc.nextInt();
        int aAt = sc.nextInt();


        int idade = aAt - this.nascimento.getAno();

        if((mAt < this.nascimento.getMes()) || (mAt == this.nascimento.getMes() && dAt < this.nascimento.getDia()))
            idade--;
        
        sc.close();
        
        return idade;        
    }

    public int obterFrequenciaMax() {
        int freqMax;
        freqMax = 220-this.obterIdade();
        return freqMax;
    }
    


}
