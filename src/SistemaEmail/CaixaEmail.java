package SistemaEmail;

import java.util.Scanner;

public class CaixaEmail {
    private Email[] emails;
    private int qtde;

    public CaixaEmail() {
    }

    public CaixaEmail(int qt) {
        qtde = qt;
        emails = new Email[qtde];
    }

    public void escreverEmail(String n) {
        Scanner nt = new Scanner(System.in);
        String p;
        int i = 0;
        for (Email email : emails) {
            if (email == null || email.getDe() == "")
                break;
            i++;
        }
        if (i < qtde) {
            if (emails[i] == null)
                emails[i] = new Email();

            emails[i].setDe(n);
            System.out.print("Para: ");
            p = nt.nextLine();
            emails[i].setPara(p);

            System.out.print("Assunto: ");
            p = nt.nextLine();
            emails[i].setAssunto(p);

            System.out.print("Mensagem: ");
            p = nt.nextLine();
            emails[i].setMensagem(p);

            System.out.println("Anexo:");
            Anexo an = new Anexo();
            System.out.println("Nome Doc: ");
            p = nt.nextLine();            
            an.setNomeDocumento(p);
            System.out.println("Tamanho Doc: ");
            int tm = nt.nextInt();
            an.setTamanhoDocumento(tm);
            nt.nextLine();
            System.out.println("Tipo Anexo: ");
            p = nt.nextLine();
            an.setTipoAnexo(p);


            emails[i].setAnexo(an);

        } else
            System.out.println("Nao ha mais espaco na lista! Apague emails");
    }

    public void listarEmail(String nome) {
        int i = 0;
        for (Email email : emails) {
            if (email != null && !email.getDe().equals("")) {
                if (email.getPara().equals(nome)) {
                    System.out.println((i+1) + " - " + email.getAssunto());
                    i++;
                }
            }
        }
    }

    public void lerUmEmail(String n) {
        Scanner nt = new Scanner(System.in);
        System.out.print("Posicao: ");
        int pos = nt.nextInt();

        for (Email email : emails) {
            if (email != null && !email.getDe().equals("")) {
                if (email.getPara().equals(n)) {
                    if (pos == 1) {
                        email.lerEmail();
                        pos--;
                    } else
                        pos--;
                }

            }
        }

    }

    public void excluirUmEmail(String nome) {
        Scanner nt = new Scanner(System.in);
        System.out.print("Posicao: ");
        int pos = nt.nextInt();

        for (Email email : emails) {
            if (email != null && !email.getDe().equals("")) {
                if (email.getPara().equals(nome)) {
                    if (pos == 1) {
                        email.excluirEmail();
                        pos--;
                    } else
                        pos--;
                }
            }
        }
    }

    

}
