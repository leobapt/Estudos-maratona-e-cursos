package exercicios_pagina2;
import java.util.Scanner;

public class Exercicio1040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		final int[] pesos = {2,3,4,1};
		double[] notas =  new double[4];
		
		for(int i = 0; i < 4; i++) {
			notas[i] = sc.nextDouble();
			
		}
		
		double somaPesos = 0;
		double somaNotas = 0;
		
		for(int i = 0; i < 4; i++) {
			somaNotas += notas[i] * pesos[i];
            somaPesos += pesos[i];
		}
		
		  double media = somaNotas / somaPesos;
	        System.out.printf("Media: %.1f%n", media);

	        // Verificação do estado do aluno
	        if (media >= 7.0) {
	            System.out.println("Aluno aprovado.");
	        } else if (media < 5.0) {
	            System.out.println("Aluno reprovado.");
	        } else {
	            System.out.println("Aluno em exame.");

	            // Leitura da nota do exame
	            double exame = sc.nextDouble();
	            System.out.printf("Nota do exame: %.1f%n", exame);

	            // Recalculando a média final
	            double mediaFinal = (media + exame) / 2.0;

	            if (mediaFinal >= 5.0) {
	                System.out.println("Aluno aprovado.");
	            } else {
	                System.out.println("Aluno reprovado.");
	            }

	            System.out.printf("Media final: %.1f%n", mediaFinal);
	        }
		
		sc.close();
	}

}
