package aplicacao;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(1, "Leandro", "leandro@gmail.com");
		Pessoa p2 = new Pessoa(2, "Ada", "ada@gmail.com");
		Pessoa p3 = new Pessoa(3, "Ifa", "ifa@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
		
	}
	
}
