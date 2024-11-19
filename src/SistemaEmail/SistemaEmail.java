package SistemaEmail;

import java.util.Scanner;

public class SistemaEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sit = 0;
        CaixaEmail caixa = new CaixaEmail(10);
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
                        caixa.escreverEmail(nome);
                        break;
                    case 2:
                        caixa.listarEmail(nome);
                        break;
                    case 3:
                        caixa.lerUmEmail(nome);
                        break;
                    case 4:
                        caixa.excluirUmEmail(nome);
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