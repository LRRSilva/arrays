package Program;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("qual a ordem da matriz:");
		int n = sc.nextInt();	
		
		int[][] mat = new int[n][n];
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ;j<n ;j++) {
				 
				mat[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("diagonal principal:");
		for(int i=0; i<n ; i++) {
			System.out.print(mat[i][i]+" "); 
			
			}
		
		System.out.println();
		
		int contaNegativos=0;
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ;j<n ;j++) {
				 
				if(mat[i][j]<0) {
					
					contaNegativos++;
					
					
					}
					
				}
			}
		
		System.out.println("numeros negativos: "+ contaNegativos);
		
	sc.close();
	}
	
	}


