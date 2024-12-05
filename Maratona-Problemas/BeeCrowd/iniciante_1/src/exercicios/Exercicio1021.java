package exercicios;
import java.util.Scanner;

public class Exercicio1021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double valorTotal = sc.nextDouble();
        
        final int[] valoresReais = {100, 50, 20, 10, 5, 2};
        final double[] valoresMoedas = {1.0, 0.5, 0.25, 0.10, 0.05, 0.01};
        
        System.out.println("NOTAS:");
        for (int valor : valoresReais) {
            int quantidadeReais = (int) (valorTotal / valor);
            System.out.println(quantidadeReais + " nota(s) de R$ " + valor + ".00");
            valorTotal %= valor;
        }
        
        System.out.println("MOEDAS:");
        for (double valor : valoresMoedas) {
            int quantidadeMoedas = (int) (valorTotal / valor);
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeMoedas, valor);
            valorTotal %= valor;
            valorTotal = Math.round(valorTotal * 100.0) / 100.0; // Corrige precisão
        }
        
        sc.close();
    }
}
