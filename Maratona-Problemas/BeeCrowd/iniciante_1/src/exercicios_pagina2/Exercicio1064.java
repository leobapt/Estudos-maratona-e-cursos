package exercicios_pagina2;
import java.util.Scanner;

public class Exercicio1064 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] valores = new double[6];
		int quantidadePositivos = 0;
		double soma = 0;
		
		for(int i = 0; i < 6; i++) {
			valores[i] = sc.nextDouble();
			if(valores[i] > 0) {
				quantidadePositivos++;
				 soma += valores[i];
			}
		}
		
		double media = soma / quantidadePositivos;
		
		System.out.println(quantidadePositivos + " valores positivos");
		System.out.printf("%.1f%n", media);
		
		sc.close();
	}

}
