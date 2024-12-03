package estrutura_Sequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        try {
            // Leitura dos dados da peça 1
            System.out.print("Digite o código da peça 1: ");
            int codigo1 = sc.nextInt();
            
            System.out.print("Digite o número de peças 1: ");
            int numero1 = sc.nextInt();
            
            System.out.print("Digite o valor unitário da peça 1: ");
            double valor1 = sc.nextDouble();

            // Leitura dos dados da peça 2
            System.out.print("Digite o código da peça 2: ");
            int codigo2 = sc.nextInt();
            
            System.out.print("Digite o número de peças 2: ");
            int numero2 = sc.nextInt();
            
            System.out.print("Digite o valor unitário da peça 2: ");
            double valor2 = sc.nextDouble();

            // Cálculo do valor total
            double total = (numero1 * valor1) + (numero2 * valor2);

            // Exibição do resultado formatado
            System.out.println("\n=== Resumo do Pedido ===");
            System.out.println("Código da peça 1: " + codigo1 + " | Quantidade: " + numero1 + " | Valor unitário: R$ " + df.format(valor1));
            System.out.println("Código da peça 2: " + codigo2 + " | Quantidade: " + numero2 + " | Valor unitário: R$ " + df.format(valor2));
            System.out.println("VALOR A PAGAR: R$ " + df.format(total));

        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de digitar os dados corretamente.");
        } finally {
            sc.close();
        }
    }
	}


