package SistemaEmail;

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
