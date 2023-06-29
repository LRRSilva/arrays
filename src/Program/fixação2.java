//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor 

package Program;

import java.util.Scanner;

public class fixação2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("quantos numeros devem ser analizados?: ");
		int n =sc.nextInt();
		
		double[] vect = new double[n];
		
		
		for (int i=0 ; i<n ; i++) {
			System.out.println("digite o "+ (i+1) + "º valor: "  );
		
			
			vect[i]=sc.nextDouble();
		}
		
		System.out.println("valores armazenados: ");
		double soma = 0;
		double media = 0;
		
		for(int i=0 ; i<n ;i++ ) {
		
			System.out.print(vect[i]+" ,");	
			
			
			 soma = soma + vect[i]; 
			 
		}
		System.out.println();
		media = soma/n;
		System.out.printf("a soma dos valores é: %.2f%n", soma);

		System.out.printf("a media dos valores é: %.2f%n", media);
		
		
		
		sc.close();
	}

}
