package SistemaEmail;

import java.util.Scanner;

public class Email {
    private String de;
    private String para;
    private String assunto;
    private String mensagem;

    public Email() {
    }

    public Email(String d, String p, String a, String m) {
        this.de = d;
        this.para = p;
        this.assunto = a;
        this.mensagem = m;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getDe() {
        return de;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getPara() {
        return para;
    }

    public void escreverEmail(String n) {
        Scanner nt = new Scanner(System.in);
        setDe(n);
        System.out.print("Para: ");
        setPara(nt.nextLine());
        System.out.print("Assunto: ");
        setAssunto(nt.nextLine());
        System.out.print("Mensagem: ");
        setMensagem(nt.nextLine());
    }

    public void lerEmail(){
        System.out.println("De: "+getDe());
        System.out.println("Assunto: "+getAssunto());
        System.out.println(getMensagem());
    }

    public void excluirEmail() {
        de = "";        
        para = "";        
        assunto = "";        
        mensagem = "";        
    }



    
}
