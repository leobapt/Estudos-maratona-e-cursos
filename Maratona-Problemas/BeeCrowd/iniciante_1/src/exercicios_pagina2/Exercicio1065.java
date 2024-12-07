package exercicios_pagina2;
import java.util.Scanner;

public class Exercicio1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] valores = new int[5];
		int quantidadePares = 0;;
		
		for(int i = 0; i < 5; i++) {
			valores[i] = sc.nextInt();
			if(valores[i] % 2 == 0) {
				quantidadePares++;
			}
		}
		
		System.out.println(quantidadePares + " valores pares");
		
		sc.close();
	}
}
