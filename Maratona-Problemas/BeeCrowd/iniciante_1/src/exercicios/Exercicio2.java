package exercicios;
//Importa a classe Scanner para permitir a entrada de dados pelo usuário
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Cria uma instância do Scanner para capturar a entrada do usuário
		Scanner sc = new Scanner(System.in);
		// lê o primeiro valor
		int valor1 = sc.nextInt();
		// lê o segundo valor
		int valor2 = sc.nextInt();
		
		// Calcula a soma dos dois valores e exibe o resultado no formato "X = resultado"
		System.out.println("X = " + (valor1 + valor2));
		
		 // Fecha o Scanner para liberar os recursos utilizados
		sc.close();

	}

}
