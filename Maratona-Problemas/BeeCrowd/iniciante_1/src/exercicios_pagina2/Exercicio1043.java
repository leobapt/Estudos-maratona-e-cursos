package exercicios_pagina2;

import java.util.Scanner;

public class Exercicio1043 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ler os valores reais A, B e C
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // Verificar se formam um triângulo
        if (A + B > C && A + C > B && B + C > A) {
            // Calcular o perímetro
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            // Calcular a área do trapézio
            double area = ((A + B) * C) / 2.0;
            System.out.printf("Area = %.1f%n", area);
        }

        sc.close();
    }
}
