package exercicios_pagina2;
import java.util.Scanner;

public class Exercicio1070 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // Leia o valor inicial
        int contador = 0; // Contador para garantir que imprimiremos 6 números ímpares

        while (contador < 6) { // Continue até encontrar 6 números ímpares
            if (x % 2 != 0) { // Verifique se o número é ímpar
                System.out.println(x);
                contador++; // Incrementa o contador apenas se for ímpar
            }
            x++; // Avance para o próximo número
        }

        sc.close();
    }
}
