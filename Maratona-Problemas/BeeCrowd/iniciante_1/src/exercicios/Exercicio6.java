package exercicios;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		  // Cria uma instância do Scanner para capturar os valores de entrada
        Scanner sc = new Scanner(System.in);

        // Lê os valores das notas A, B e C
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // Define os pesos das notas
        double pesoA = 2.0;
        double pesoB = 3.0;
        double pesoC = 5.0;

        // Calcula a média ponderada
        double media = ((A * pesoA) + (B * pesoB) + (C * pesoC)) / (pesoA + pesoB + pesoC);

        // Exibe o resultado no formato esperado, com 1 casa decimal
        // Inclui o espaço antes e depois do "=" e o fim de linha (%n)
        System.out.printf("MEDIA = %.1f%n", media);

        // Fecha o Scanner para liberar os recursos
        sc.close();
	}

}
