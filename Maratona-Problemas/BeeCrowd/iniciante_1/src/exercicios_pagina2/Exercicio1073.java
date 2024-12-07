package exercicios_pagina2;
import java.util.Scanner;

public class Exercicio1073 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura do valor inteiro N
        int n = sc.nextInt();

        // Loop para iterar pelos números de 1 até N
        for (int i = 2; i <= n; i += 2) { // Incrementa de 2 em 2 para pegar apenas pares
            System.out.println(i + "^2 = " + (i * i)); // Calcula e imprime o quadrado do número par
        }

        sc.close();
    }
}
