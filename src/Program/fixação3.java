//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver. 

package Program;

import java.util.Scanner;

import entities.pessoas;

public class fixação3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("quantas pessoas serão cadastradas? :");
		int n = sc.nextInt();
		
		pessoas[]vect = new pessoas[n];
		
		for(int i=0 ; i<n ; i++) {
			System.out.println("qual nome da "+(i+1)+"º pessoa: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("qual altura da "+(i+1)+"º pessoa: ");
			double altura = sc.nextDouble();
			
			System.out.println("qual idade da "+(i+1)+"º pessoa: ");
			int idade = sc.nextInt();
			
			vect[i] = new pessoas(nome, altura, idade);
			
			}
		double soma=0;
			
		for(int i=0 ; i<n ; i++) {
			soma = soma + vect[i].getAltura();
			
		}
		double mediaAlturas=0;
		mediaAlturas=soma/n;
		
			System.out.printf(" a media das alturas é : %.2f%n ", mediaAlturas );
		
		
		int contMenores=0;
		int quant=0;
		for(int i=0 ; i<n ; i++) {
			if(vect[i].getIdade() < 16) {
				contMenores = contMenores + 1;
				
				
				System.out.println(vect[i].getNome() +" é menor de 16 anos ");
				
			}
		}
		quant= contMenores/n*100;
		
		System.out.println("a porcentagem de menores de 16 é : " + quant + "%" );
		
		
		
		sc.close();
	}

}
