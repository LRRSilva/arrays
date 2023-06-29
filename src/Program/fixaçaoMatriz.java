package Program;

import java.util.Scanner;

public class fixaçaoMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("quantas linhas a matriz vai ter? ");
		int m = sc.nextInt();
		System.out.println("e quantas colunas ela vai ter? ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		System.out.println("digite as linhas da matriz");
		for(int i=0 ; i<m ; i++) {
			for(int j=0 ;j<n ;j++) {
				
				
				mat[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("qual numero quer buscar na matriz? ");
		int numeroM= sc.nextInt();
		
		for(int i=0 ; i<mat.length ; i++) {
			for(int j=0 ;j<mat[i].length ;j++) {
				 
				if(mat[i][j]==numeroM) {
					System.out.println("posição: "+ "["+i+"]"+ "["+j+"]" );
				}
				 if(j>0){
				System.out.println("numero a esquerda: "+ mat[i][j-1]);	
				}
				 if(i>0) {
					System.out.println("numero a cima: "+mat[i-1][j]);
				}
				 if(j<i-1){
					System.out.println("numero a direita: "+mat[i][j+1]);
				}
				 if(i<mat.length -1) {
					System.out.println("numero a baixo: "+mat[i+1][j]);
				}	
					
			}
		}
		System.out.println();
		
		
		
		
sc.close();
	}

}
