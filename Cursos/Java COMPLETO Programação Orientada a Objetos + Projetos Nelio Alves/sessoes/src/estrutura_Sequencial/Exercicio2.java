package estrutura_Sequencial;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double raio = sc.nextDouble();
		
		double area = pi * raio * raio;
		
		System.out.println("A=" + area);
		
		sc.close();
	}

}
