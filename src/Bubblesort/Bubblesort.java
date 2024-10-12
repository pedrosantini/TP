package Bubblesort;

import java.util.Random;

public class Bubblesort{
	public static void main(String[] args) {
		Random x = new Random();
		
		int[] v = new int[10];
		
		for(int i=0; i < 10; i++) {
			v[i] = x.nextInt(10);
		}
		
		for(int i=0; i < 10; i++) {
			System.out.print(v[i]+" ");
		}
		int aux;
		for(int i=1; i < 10; i++) {
			for(int j=0; j < i; j++) {
				if(v[j] > v[i]) {
					aux = v[j];
					v[j] = v[i];
					v[i] = aux;
				}
			}
		}
		System.out.println("");
		for(int i=0; i < 10; i++) {
			System.out.print(v[i]+" ");
		}
		
	}
	
}