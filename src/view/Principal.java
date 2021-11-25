package view;

import controller.ModController;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Método construtor
		ModController md = new ModController();
		
		//Recebendo o primeiro número
		System.out.println("Digite o primeiro número: ");
		double numero = sc.nextDouble();
		
		//Recebendo o segundo número
		System.out.println("Digite o segundo número: ");
		double numerocont = sc.nextDouble();
		
		double resultado = md.mod(numero, numerocont);
		

		System.out.println("O número aparece "+resultado+" vezes.");

	}

}