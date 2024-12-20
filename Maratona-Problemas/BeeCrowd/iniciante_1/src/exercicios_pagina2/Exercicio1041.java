package exercicios_pagina2;
import java.util.Scanner;

public class Exercicio1041{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ler coordenadas como números de ponto flutuante
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        // Verificar em qual quadrante ou eixo o ponto se encontra
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }

        sc.close();
    }
}
