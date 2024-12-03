package estrutura_Sequencial;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double D = sc.nextDouble();
		double diferenca = (A * B - C * D);
		
		System.out.println("Diferenca = " + diferenca);
		
		sc.close();
	}

}
