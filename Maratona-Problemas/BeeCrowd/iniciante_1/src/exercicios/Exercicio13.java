package exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        // Cria um Scanner para leitura da entrada
        Scanner sc = new Scanner(System.in);

        // Lê os três valores inteiros
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Calcula o maior entre a e b
        int maiorAB = (a + b + Math.abs(a - b)) / 2;

        // Calcula o maior entre maiorAB e c
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        // Exibe o resultado
        System.out.println(maior + " eh o maior");

        // Fecha o Scanner
        sc.close();
    }
}
