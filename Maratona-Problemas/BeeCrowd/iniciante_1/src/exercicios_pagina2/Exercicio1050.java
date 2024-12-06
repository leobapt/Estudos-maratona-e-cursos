package exercicios_pagina2;

import java.util.Scanner;

public class Exercicio1050 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o DDD
        int ddd = sc.nextInt();

        // Identifica a cidade correspondente
        String cidade;
        switch (ddd) {
            case 61:
                cidade = "Brasilia";
                break;
            case 71:
                cidade = "Salvador";
                break;
            case 11:
                cidade = "Sao Paulo";
                break;
            case 21:
                cidade = "Rio de Janeiro";
                break;
            case 32:
                cidade = "Juiz de Fora";
                break;
            case 19:
                cidade = "Campinas";
                break;
            case 27:
                cidade = "Vitoria";
                break;
            case 31:
                cidade = "Belo Horizonte";
                break;
            default:
                cidade = "DDD nao cadastrado";
                break;
        }

        // Exibe o resultado
        System.out.println(cidade);

        sc.close();
    }
}
