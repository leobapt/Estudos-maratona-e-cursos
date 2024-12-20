package exercicios_pagina2;

import java.util.Scanner;

public class Exercicio1051 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o valor do salário
        double salario = sc.nextDouble();

        // Inicializa o imposto a ser calculado
        double imposto = 0.0;

        // Calcula o imposto com base na tabela fornecida
        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else {
            if (salario > 2000.00 && salario <= 3000.00) {
                imposto += (salario - 2000.00) * 0.08;
            } else if (salario > 3000.00 && salario <= 4500.00) {
                imposto += 1000.00 * 0.08; // Faixa de 2000.01 a 3000.00
                imposto += (salario - 3000.00) * 0.18;
            } else if (salario > 4500.00) {
                imposto += 1000.00 * 0.08; // Faixa de 2000.01 a 3000.00
                imposto += 1500.00 * 0.18; // Faixa de 3000.01 a 4500.00
                imposto += (salario - 4500.00) * 0.28;
            }

            // Exibe o imposto formatado com duas casas decimais
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}
