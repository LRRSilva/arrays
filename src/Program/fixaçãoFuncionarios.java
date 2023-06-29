package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class fixaçãoFuncionarios {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("quantos funcionarios serao cadastrados? : ");
		int n = sc.nextInt();
		
		List<Funcionario> list = new ArrayList<>();
		
		for(int i=1 ; i<=n ; i++) {
			
			System.out.println("qual id do "+ i+" funcionario: " );
			int id = sc.nextInt();
			
			System.out.println("qual nome do "+ i+ " funcionario: " );
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("qual salario do "+ i +" funcionario: " );
			double salario = sc.nextDouble();
			
			list.add(new Funcionario(id,nome,salario));
			
		}
		
		System.out.println("qual id do funcionario que vai ter aumento?");
		int id= sc.nextInt();
		Funcionario F = list.stream().filter(x->x.getId() == id).findFirst().orElse(null);
		
		if(F==null) {
			System.out.println("numedo de id inválido");
			
		}else {
			System.out.println("qual a porcentagem que o salario dele vai aumentar? ");
			double porcentagem=sc.nextDouble();
			
			F.incrementarSalario(porcentagem);
		}
		
		for(Funcionario x: list) {
			System.out.println(x);
		}
		
		
		
		
		sc.close();
	}

}
