package exercicios_pagina2;

import java.util.Scanner;

public class Exercicio1044 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ler os dois valores inteiros A e B
        int A = sc.nextInt();
        int B = sc.nextInt();

        // Verificar se são múltiplos
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
