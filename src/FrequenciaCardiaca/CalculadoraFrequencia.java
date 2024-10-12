package FrequenciaCardiaca;
import java.util.Scanner;

public class CalculadoraFrequencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FrequenciaCardiaca p = new FrequenciaCardiaca("Suzano", "de Souza", 15, 3,2001);
        FrequenciaCardiaca p2 = new FrequenciaCardiaca();

        System.out.println("Digite seu nome: ");
        String n = sc.nextLine();
        System.out.println("Digite seu sobrenome:");
        String s = sc.nextLine();
        
        int d = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();




        System.out.println(p.obterIdade());
        System.out.println(p2.obterIdade());

        sc.close();
        

    }
}
