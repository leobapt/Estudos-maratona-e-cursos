package exercicios;
import java.util.Scanner; 

public class Exercicio8 {

	public static void main(String[] args) {
		// Cria uma instância do Scanner para capturar os valores da entrada
		Scanner sc = new Scanner(System.in);
		
		//lê valores de entrada
		int numero_Funcionario = sc.nextInt();
		int horas_trabalhadas = sc.nextInt();
		double valor_por_horas = sc.nextDouble();
		
		// calcula o salario
		double salario = valor_por_horas * horas_trabalhadas;
		
		//exibe o resultado
		System.out.println("NUMBER = " + numero_Funcionario);
		System.out.printf("SALARY = U$  %.2f%n", salario);
		
		sc.close();
	}

}
