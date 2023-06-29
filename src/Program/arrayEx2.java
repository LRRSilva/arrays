package Program;

import java.util.Scanner;

import entities.product;

public class arrayEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		product[] vect = new product[n];
		
		
		for(int i=0 ; i<n ;i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new product(name,price);
			 
			
		}
		double soma=0;
		for (int i=0 ; i<n ; i++) {
			soma += vect[i].getPrice();
			
		}
		double media = soma/n;
		System.out.println(media);
		
		
		
		sc.close();
	}

}
