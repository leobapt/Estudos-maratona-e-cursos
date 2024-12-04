package exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        // Constante para o valor de pi
        final double PI = 3.14159;

        // Cria o Scanner para leitura de entrada
        Scanner sc = new Scanner(System.in);

        // Lê os valores A, B e C
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // Calcula as áreas
        double areaTriangulo = (A * C) / 2.0;
        double areaCirculo = PI * Math.pow(C, 2);
        double areaTrapezio = ((A + B) * C) / 2.0;
        double areaQuadrado = Math.pow(B, 2);
        double areaRetangulo = A * B;

        // Exibe os resultados formatados
        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

        // Fecha o Scanner
        sc.close();
    }
}
