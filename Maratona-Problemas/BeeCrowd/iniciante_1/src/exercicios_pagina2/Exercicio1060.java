package exercicios_pagina2;
import java.util.Scanner;

public class Exercicio1060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double[] valores = new double[6];
		int contadorPositivos = 0;
		
		for(int i = 0; i < 6; i++) {
			valores[i] = sc.nextDouble();
			if(valores[i] > 0) {
				contadorPositivos++;
			}
		}
		
		 System.out.println(contadorPositivos + " valores positivos");
		
		sc.close();
	}

}
