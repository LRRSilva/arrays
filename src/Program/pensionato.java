package Program;

import java.util.Scanner;

import entities.locação;

public class pensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		int n;
		
		String []vect = new String[10]; 
		
		System.out.println("quantos quartos vao ser alugados? ");
		n=sc.nextInt();
		
		for(int i=1 ; i<n ;i++) {
			System.out.println();
			System.out.println("aluguel #"+ i +":" );
			System.out.print("nome do aluno:");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("email do aluno:");
			String email = sc.next();
			
			System.out.println("qual quarto o aluno deseja alugar (0-9):");
			int nquarto = sc.nextInt();
			
//			vect[nquarto] = new locação(nome, email);
			
			

			
			
			
			
			
		}
		
		
		
		
		
		
		
		
			
		
	sc.close();	
	}
}
