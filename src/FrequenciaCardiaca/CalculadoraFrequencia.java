package FrequenciaCardiaca;
import java.util.Scanner;

public class CalculadoraFrequencia {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        FrequenciaCardiaca p = new FrequenciaCardiaca("Suzano", "de Souza", 15, 3,2001);
        FrequenciaCardiaca p2 = new FrequenciaCardiaca();

        System.out.print("Digite o dia de nascimento: ");
        int d = sc1.nextInt();
        System.out.print("Digite o mes de nascimento: ");
        int m = sc1.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        int a = sc1.nextInt();

        sc1.nextLine();

        System.out.print("Digite seu nome: ");
        String n = sc1.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String s = sc1.nextLine();
       
        p2.setNascimento(d, m, a);
        
        p2.setNome(n);
        p2.setSobrenome(s);

        System.out.print("Dia atual: ");
        int dAt = sc1.nextInt();
        System.out.print("Mes atual: ");
        int mAt = sc1.nextInt();
        System.out.print("Ano atual: ");
        int aAt = sc1.nextInt();

        System.out.println(p.obterIdade(dAt, mAt, aAt));
        System.out.println(p2.obterIdade(dAt, mAt, aAt));

        System.out.printf("A frequencia max de %s %s eh %d\n",p.getNome(), p.getSobrenome(),p.obterFrequenciaMax(dAt, mAt, aAt));
        System.out.printf("A frequencia max de %s %s eh %d\n",p2.getNome(), p2.getSobrenome(),p2.obterFrequenciaMax(dAt, mAt, aAt));

        System.out.printf("A frequencia ideal de %s %s eh %.2f\n",p.getNome(), p.getSobrenome(), p.obterFrequenciaIdeal(p.obterFrequenciaMax(dAt, mAt, aAt)));
        System.out.printf("A frequencia ideal de %s %s eh %.2f\n",p2.getNome(), p2.getSobrenome(), p2.obterFrequenciaIdeal(p2.obterFrequenciaMax(dAt, mAt, aAt)));
 
        sc1.close();        

    }
}
