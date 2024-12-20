package exercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        // Cria o Scanner para entrada de dados
        Scanner sc = new Scanner(System.in);

        // Lê os valores de x1 e y1
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        // Lê os valores de x2 e y2
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Calcula a distância entre os pontos usando a fórmula
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        // Exibe a distância com 4 casas decimais
        System.out.printf("%.4f%n", distancia);

        // Fecha o Scanner
        sc.close();
    }
}
