package exercicios_pagina2;
import java.util.Scanner;

public class Exercicio1046 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura das horas de início e fim
        int horaInicio = sc.nextInt();
        int horaFim = sc.nextInt();

        // Cálculo da duração
        int duracao;

        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        } else if (horaInicio > horaFim) {
            duracao = 24 - horaInicio + horaFim;
        } else {
            duracao = 24; // Caso as horas sejam iguais, duração é de 24 horas
        }

        // Exibição do resultado
        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);

        sc.close();
    }
}
