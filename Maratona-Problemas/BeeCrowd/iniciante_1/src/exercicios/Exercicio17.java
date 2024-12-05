package exercicios;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        // Criação do Scanner para entrada de dados
        Scanner sc = new Scanner(System.in);

        // Entrada dos valores
        int tempoGastoHoras = sc.nextInt(); // Tempo em horas
        int velocidadeMediaKm = sc.nextInt(); // Velocidade média em km/h

        // Consumo médio do veículo (12 km/L)
        final int CONSUMO_MEDIO = 12;

        // Cálculo da quantidade de combustível necessária
        double quantidadeLitrosNecessaria = (tempoGastoHoras * velocidadeMediaKm) / (double) CONSUMO_MEDIO;

        // Impressão do resultado com 3 casas decimais
        System.out.printf("%.3f%n", quantidadeLitrosNecessaria);

        // Fechando o Scanner
        sc.close();
    }
}
