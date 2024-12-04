package exercicios;
import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		//Cria uma instância do scanner para capturar valores da entrada
		Scanner sc = new Scanner(System.in);
		
		//lê valores da entrada
		String nome = sc.next();
		sc.nextLine();
		double salario_fixo = sc.nextDouble();
		double total_de_vendas = sc.nextDouble();
		double comissao_15 = 0.15;
		
		//calcular comissão
		double comissao_vendas_efetuadas = total_de_vendas * comissao_15;
		double total_recebido = comissao_vendas_efetuadas + salario_fixo;
		//exibe o resultado
		System.out.printf("TOTAL = R$ %.2f%n", total_recebido);
		
		sc.close();
	}

}
