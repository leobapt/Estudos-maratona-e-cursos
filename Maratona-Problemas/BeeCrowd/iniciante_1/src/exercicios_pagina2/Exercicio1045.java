package exercicios_pagina2;
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio1045 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos valores
        double[] lados = new double[3];
        lados[0] = sc.nextDouble();
        lados[1] = sc.nextDouble();
        lados[2] = sc.nextDouble();

        // Ordenar os lados em ordem decrescente
        Arrays.sort(lados);
        double A = lados[2];
        double B = lados[1];
        double C = lados[0];

        // Verificar se forma triângulo
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            // Determinar o tipo do triângulo
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (A * A < B * B + C * C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            // Verificar características adicionais
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();
    }
}
