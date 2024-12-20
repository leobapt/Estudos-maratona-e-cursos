package exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        // Cria um Scanner para leitura da entrada
        Scanner sc = new Scanner(System.in);

        // Lê a distância total percorrida (em Km)
        int distancia = sc.nextInt();

        // Lê o total de combustível gasto (em litros)
        double combustivel = sc.nextDouble();

        // Calcula o consumo médio (Km/l)
        double consumoMedio = distancia / combustivel;

        // Exibe o resultado com 3 casas decimais
        System.out.printf("%.3f km/l%n", consumoMedio);

        // Fecha o Scanner
        sc.close();
    }
}
