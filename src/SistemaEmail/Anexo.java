package SistemaEmail;

public class Anexo {
    private String tipoAnexo;
    private String nomeDocumento;
    private int tamanhoDocumento;

    public Anexo(String tA, String nD, int tD) {
        tipoAnexo = tA;
        nomeDocumento = nD;
        tamanhoDocumento = tD;
    }

    public Anexo(){
    }

    public void setNomeDocumento(String nomeDocumento) {
        this.nomeDocumento = nomeDocumento;
    }

    public void setTamanhoDocumento(int tamanhoDocumento) {
        this.tamanhoDocumento = tamanhoDocumento;
    }

    public void setTipoAnexo(String tipoAnexo) {
        this.tipoAnexo = tipoAnexo;
    }

    public String getNomeDocumento() {
        return nomeDocumento;
    }

    public int getTamanhoDocumento() {
        return tamanhoDocumento;
    }

    public String getTipoAnexo() {
        return tipoAnexo;
    }

    public String toString(){
        return "Nomedoc: "+getNomeDocumento()+" Tamanho doc: "+getTamanhoDocumento()+" Tipo anexo: "+ getTipoAnexo();
    }

    
}
