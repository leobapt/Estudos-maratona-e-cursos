package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
	    // Cria uma instância do Scanner para capturar os valores de entrada
        Scanner sc = new Scanner(System.in);

        // Lê os valores das notas A e B, ambos como double
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        // Define os pesos das notas
        double pesoA = 3.5;
        double pesoB = 7.5;

        // Calcula a média ponderada
        double media = ((A * pesoA) + (B * pesoB)) / (pesoA + pesoB);

        // Exibe o resultado no formato esperado, com 5 casas decimais
        // Inclui o espaço antes e depois do "=" e o fim de linha (%n)
        System.out.printf("MEDIA = %.5f%n", media);

        sc.close();
	}

}
