package Matrizes;
import java.util.Scanner;



public class Matrizes{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		while(n != -1) {
			n = sc.nextInt();
			
			if(eh_primo(n)) {
				int[][] mat = new int[n][2*n-1];
				
				for(int i=0; i < n; i++){
				    for(int j=0;j < 2*n-1; j++){
		                if((i <= j) && (j < (2*n-1)-i))
		                    mat[i][j] = 1;
		                else
		                    mat[i][j] = 0;
				    } 
				}
				
				for(int i=0; i < n; i++){
				    for(int j=0;j < 2*n-1; j++){
				        System.out.print(mat[i][j] + " ");
				    }
				    System.out.print("\n");
				}

			}
		}
		sc.close();
	}
	static boolean eh_primo(int n) {
		int cont=0;
		
		for(int i=1; i <= n; i++) {
			if(n%i==0) {
				cont++;
			}
		}
		if(cont==2)
			return true;
		
		return false;
	}
}