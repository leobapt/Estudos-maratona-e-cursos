package exercicios_pagina2;
import java.util.Scanner;
public class Exercicio1038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		final double[] precos = {0,4.00, 4.5, 5.0, 2.0, 1.5};
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total = precos[codigo] * quantidade;
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}

}