package estrutura_Sequencial;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		int soma = (valor1 + valor2);
		
		System.out.println("SOMA = " + soma);
		sc.close();
	}

}
