package exercicios_pagina2;
import java.util.Scanner;

public class Exercicio1071 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos dois valores inteiros
        int x = sc.nextInt();
        int y = sc.nextInt();

        // Determina o menor e o maior valor para evitar problemas com a ordem
        int menor = Math.min(x, y);
        int maior = Math.max(x, y);

        int soma = 0;

        // Percorre os números entre menor e maior (exclusivo)
        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) { // Verifica se o número é ímpar
                soma += i;
            }
        }

        // Imprime o resultado
        System.out.println(soma);

        sc.close();
    }
}
