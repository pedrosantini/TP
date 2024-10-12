package impares;
import java.util.Scanner;

public class Impares{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		int n = teclado.nextInt();
		
		for(int i=1; i < n; i=i+2) {
			System.out.println(i+" ");
		}
		
		teclado.close();
	}
}

