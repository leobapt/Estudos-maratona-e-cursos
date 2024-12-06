package exercicios;
import java.util.Scanner;
public class Exercicio18 {

	public static void main(String[] args) {
		// Cria uma instância para capturar dados
		Scanner sc = new Scanner(System.in);
		
		int quantidadeTotalReais = sc.nextInt();
		 //Array com valores dos reais
		
		final int[] notas = {100, 50, 20, 10, 5, 2, 1};
		
		 System.out.println(quantidadeTotalReais);
		 
		 for(int nota: notas) {
			 int quantidadeNotas = quantidadeTotalReais / nota ;
			 System.out.println(quantidadeNotas + " nota(s) de R$ " + nota + ",00");
			 quantidadeTotalReais %= nota;
			 
		 }
		
		sc.close();
	}

}