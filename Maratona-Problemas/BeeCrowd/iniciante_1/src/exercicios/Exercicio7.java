package exercicios;
import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		  // Cria uma instância do Scanner para capturar os valores de entrada
        Scanner sc = new Scanner(System.in);

        // Lê os quatro valores inteiros A, B, C e D
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        // Calcula a diferença do produto de A e B pelo produto de C e D
        int diferenca = (A * B) - (C * D);

        // Exibe o resultado no formato esperado
        // Inclui o espaço antes e depois do "=" e o fim de linha (%n)
        System.out.printf("DIFERENCA = %d%n", diferenca);

        // Fecha o Scanner para liberar os recursos
        sc.close();
	}

}
