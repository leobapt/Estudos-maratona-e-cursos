package exercicios_pagina2;

import java.util.Scanner;

public class Exercicio1048 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double novoSalario, reajuste;
        int percentual = 0;

        // Determinar o percentual de reajuste
        if (salario >= 0 && salario <= 400) {
            percentual = 15;
        } else if (salario > 400 && salario <= 800) {
            percentual = 12;
        } else if (salario > 800 && salario <= 1200) {
            percentual = 10;
        } else if (salario > 1200 && salario <= 2000) {
            percentual = 7;
        } else if (salario > 2000) {
            percentual = 4;
        }

        // Calcular reajuste e novo salário
        reajuste = salario * percentual / 100;
        novoSalario = salario + reajuste;

        // Exibir resultados
        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.printf("Em percentual: %d %%\n", percentual);

        sc.close();
    }
}
