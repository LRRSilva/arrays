//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 

package Program;

import java.util.Scanner;

public class fixação1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("digite um numero até dez : ");
		int n = sc.nextInt();
		
		int[] vect = new int[n]; 
		
		for (int i=0 ; i<n ; i++) {
			System.out.println("digite o "+ (i+1) +"º numero:"  );
			vect[i] = sc.nextInt();
			
		}
		
		System.out.println("Numeros negativos lidos: ");
		
		for(int i=0; i<n; i++) {
			if(vect[i] < 0) {
				
				System.out.println(vect[i]);
				
				
			}
			
		}
		
		
		
		
		sc.close();
	}

}
