package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		//Criar uma instância para capturar valores da entrada
		Scanner sc = new Scanner(System.in);
		
		//lê valores de entrada da primeira peça
		int num_peca1 = sc.nextInt();
		int quantidade_pecas1 = sc.nextInt();
		double valor_unitario_peca1 = sc.nextDouble();
		
		//lê valores de entrada da segunda peça
		int num_peca2 = sc.nextInt();
		int quantidade_pecas2 = sc.nextInt();
		double valor_unitario_peca2 = sc.nextDouble();
		
		//calcular valor total de peças
		double valorTotal_pecas = (quantidade_pecas1 * valor_unitario_peca1) + (quantidade_pecas2 * valor_unitario_peca2);
		
		//imprimior na tela o valor total
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal_pecas);
		
		sc.close();
	}

}
