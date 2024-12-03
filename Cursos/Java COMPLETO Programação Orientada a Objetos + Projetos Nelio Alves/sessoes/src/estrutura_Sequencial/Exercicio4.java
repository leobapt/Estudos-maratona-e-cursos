package estrutura_Sequencial;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int horasTrabalhada = sc.nextInt();
		double valorPorHora = sc.nextDouble();
		
		double salario = horasTrabalhada * valorPorHora;
		
		System.out.println("NUMBER = " + number);
		System.out.println("SALARY = " + salario);
		
		sc.close();
	}

}
