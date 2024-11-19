package SistemaEmail;

public class Email {
    private String de;
    private String para;
    private String assunto;
    private String mensagem;
    private Anexo[] anexos;
    private int qtdAnexos;
    private Date data;

    public Email() {
        data = new Date();
        qtdAnexos = 0;
        anexos = new Anexo[10];
    }

    public Email(String d, String p, String a, String m, int dia, int mes, int ano) {
        de = d;
        para = p;
        assunto = a;
        mensagem = m;
        anexos = new Anexo[10];
        qtdAnexos = 0;
        data = new Date(dia, mes, ano);
    }

    public void setAssunto(String ass) {
        assunto = ass;
    }

    public void setDe(String d) {
        de = d;
    }

    public void setMensagem(String m) {
        mensagem = m;
    }

    public void setPara(String p) {
        para = p;
    }

    public void setAnexo(Anexo an) {
        for (Anexo a : anexos) {
            if (a == null){
                a = new Anexo();
                a = an;
                this.qtdAnexos++;
                break;
            }
        }       
    }

    public void setData(Date d) {
        data = d;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getDe() {
        return de;
    }

    public Anexo getAnexo(int n) {
        int i=1;
        for (Anexo a : anexos) {
            if (i == n){
                return a;
            }
            i++;
            
        }
        return null;        
    }

    public Date getData() {
        return data;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getPara() {
        return para;
    }

    public void lerEmail(){
        System.out.println("De: "+getDe());
        System.out.println("Assunto: "+getAssunto());
        System.out.println(getMensagem());
        System.err.println("Enviado "+ this.getData().getDia() + "/" + this.getData().getMes() + "/" + this.getData().getAno());
        System.out.println("Anexo: " + anexos[0].toString());;
    }

    public String toString(){
        return "De: "+getDe()+" Assunto: "+getAssunto()+" Mensagem: "+ getMensagem();
    }


    public void excluirEmail() {
        de = "";        
        para = "";        
        assunto = "";        
        mensagem = "";        
    }    
}
