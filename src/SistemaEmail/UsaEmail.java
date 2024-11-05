//package SistemaEmail;

import java.io.File; //funciona somente rodando no terminal.
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;


public class UsaEmail {
    public static Email[] restaurar_sistema(){

        File arquivo = new File("backup.dat");
        try {
            FileInputStream fin = new FileInputStream(arquivo);
            ObjectInputStream oin = new ObjectInputStream(fin);

            Email[] agendaArq = (Email[]) oin.readObject();
            oin.close();
            fin.close();

            for (Email email : agendaArq) {
               email.lerEmail();             
            }
            return agendaArq;
        }
        catch(Exception ex) {
            System.err.println("erro: "+ex.toString());
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sit = 0;
        Email[] lista = new Email[10];
        int i=0;
        int x = 1;

        do{           
            System.out.print("Login: ");
            String nome = sc.nextLine();  
            System.out.println("Ola, "+ nome);      
            do {
                System.out.println("1: Escrever email");
                System.out.println("2: Listar os emails");
                System.out.println("3: Ler um email");
                System.out.println("4: Excluir um email");
                System.out.println("5: Fazer logout");
                System.out.println("6: Restaurar sistema");

                sit = sc.nextInt();
                sc.nextLine();

                switch (sit) {
                    case 1:
                        i=0;
                        for (Email email : lista) {
                            if(email == null || email.getDe() == "")
                                break;
                            i++;
                        }
                        if(i < 10){
                            lista[i] = new Email();
                            lista[i].escreverEmail(nome);
                        }
                        else
                            System.out.println("Nao ha mais espaco na lista! Apague emails");
                        break;
                    case 2:
                        
                        for (Email email : lista) {
                            if(email != null && !email.getDe().equals("")){
                                if (email.getPara().equals(nome)) {
                                    System.out.println(email.getAssunto());
                                }                    
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Posicao: ");
                        int pos = sc.nextInt();
                        System.out.println(pos);


                        for (Email email : lista) {
                            if(email != null && !email.getDe().equals("")){
                                if (email.getPara().equals(nome)) {
                                    if (pos==1) {
                                        email.lerEmail();
                                        pos--;
                                    }
                                    else
                                        pos--;
                                }
                                    
                            }
                        }
                        break;
                    case 4:
                        System.out.print("Posicao: ");
                        pos = sc.nextInt();

                        for (Email email : lista) {
                            if(email != null && !email.getDe().equals("")){
                                if (email.getPara().equals(nome)) {
                                    if (pos==1) {
                                        email.excluirEmail();
                                        pos--;
                                    }
                                    else
                                        pos--;
                                }
                            }
                        }
                    break;
                    case 5:
                        sit = 5;
                        break;  
                    case 6:
                        lista = restaurar_sistema();                 
                
                    default:
                        System.err.println("Escolha uma das 5 opcoes:");
                        break;
                }
            } while (sit != 5);
            System.out.println("1: Logar novamente");
            System.out.println("2: Sair do programa");
            x = sc.nextInt();
            sc.nextLine();
        } while(x != 2);
        sc.close();
    }
    
}