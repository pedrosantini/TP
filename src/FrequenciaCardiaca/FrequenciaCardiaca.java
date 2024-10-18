package FrequenciaCardiaca;

public class FrequenciaCardiaca {

    public class Date {
        private int dia;
        private int mes;
        private int ano;
    
        public Date() {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1900;
        }
    
        public Date(int d, int m, int a) {
            this.dia = d;
            this.mes = m;
            this.ano = a;
        }
    
        public void setDia(int dia) {
            this.dia = dia;
        }
    
        public void setMes(int mes) {
            if ((mes <= 12) && (mes > 0))
                this.mes = mes;
            else
                mes = 1;
        }
    
        public void setAno(int ano) {
            this.ano = ano;
        }
    
        public int getDia() {
            return dia;
        }
    
        public int getMes() {
            return mes;
        }
    
        public int getAno() {
            return ano;
        }
    
        public void mostraData() {
            System.out.println(getDia() + "/" + getMes() + "/" + getAno());
        }
    
    }

    private String nome;
    private String sobrenome;
    private Date nascimento;

    public FrequenciaCardiaca(String n, String s, int d, int m, int a) {
        this.nome = n;
        this.sobrenome = s;
        this.nascimento = new Date(d, m, a);
    }

    public FrequenciaCardiaca(){
        this.nascimento = new Date();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setNascimento(int d, int m, int a) {
        this.nascimento.setDia(d);
        this.nascimento.setMes(m);
        this.nascimento.setAno(a);
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

    public int obterIdade(int dAt, int mAt, int aAt) {

        int idade = aAt - this.nascimento.getAno();

        if((mAt < this.nascimento.getMes()) || (mAt == this.nascimento.getMes() && dAt < this.nascimento.getDia()))
            idade--;
        
        return idade;        
    }

    public int obterFrequenciaMax(int dAt, int mAt, int aAt) {
        int freqMax;
        freqMax = 220-this.obterIdade(dAt, mAt, aAt);
        return freqMax;
    }

    public double obterFrequenciaIdeal(int freqMax) {
        double freqId;
        freqId = freqMax*.675;
        
        return freqId;
    }

}
