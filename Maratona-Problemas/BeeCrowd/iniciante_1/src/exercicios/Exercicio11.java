package exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        // Constante para o valor de pi
        final double PI = 3.14159;

        // Cria um Scanner para leitura de entrada
        Scanner sc = new Scanner(System.in);

        // Lê o raio da esfera
        double raio = sc.nextDouble();

        // Calcula o volume da esfera usando a fórmula (4/3) * pi * R^3
        double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);

        // Exibe o resultado formatado com três casas decimais
        System.out.printf("VOLUME = %.3f%n", volume);

        // Fecha o Scanner
        sc.close();
    }
}
