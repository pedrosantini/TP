package SistemaEmail;
import java.util.Scanner;


public class UsaEmail {
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
                sit = sc.nextInt();
                sc.nextLine();

                switch (sit) {
                    case 1:
                        i=0;
                        for (Email email : lista) {
                            if(email == null)
                                break;
                            i++;
                        }
                        lista[i] = new Email();
                        lista[i].escreverEmail(nome);
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
                        System.out.print("Digite o assunto: ");
                        String ass = sc.nextLine();

                        for (Email email : lista) {
                            if(email != null && !email.getDe().equals("")){
                                if ((email.getPara().equals(nome)) && (email.getAssunto().equals(ass))) {
                                    email.lerEmail();
                                }
                            }
                        }
                        break;
                    case 4:
                        System.out.print("Digite o assunto: ");
                        ass = sc.nextLine();

                        for (Email email : lista) {
                            if(email != null && !email.getDe().equals("")){
                                if ((email.getPara().equals(nome)) && (email.getAssunto().equals(ass))) {
                                    email.excluirEmail();
                                }
                            }
                        }
                    break;
                    case 5:
                        sit = 5;
                        break;                   
                
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