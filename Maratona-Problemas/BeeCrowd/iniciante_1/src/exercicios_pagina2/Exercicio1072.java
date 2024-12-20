package exercicios_pagina2;
import java.util.Scanner;

public class Exercicio1072 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura do número de casos de teste
        int n = sc.nextInt();

        int in = 0; // Contador para valores dentro do intervalo
        int out = 0; // Contador para valores fora do intervalo

        // Loop para ler os valores e verificar o intervalo
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }

        // Impressão do resultado
        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}
