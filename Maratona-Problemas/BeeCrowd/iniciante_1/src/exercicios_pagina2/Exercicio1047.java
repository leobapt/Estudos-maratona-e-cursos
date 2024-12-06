package exercicios_pagina2;
import java.util.Scanner;

public class Exercicio1047 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura das horas e minutos iniciais e finais
        int horaInicio = sc.nextInt();
        int minutoInicio = sc.nextInt();
        int horaFim = sc.nextInt();
        int minutoFim = sc.nextInt();

        // Cálculo da duração
        int inicioTotalMinutos = horaInicio * 60 + minutoInicio;
        int fimTotalMinutos = horaFim * 60 + minutoFim;

        int duracaoTotalMinutos;

        if (fimTotalMinutos > inicioTotalMinutos) {
            duracaoTotalMinutos = fimTotalMinutos - inicioTotalMinutos;
        } else {
            duracaoTotalMinutos = (24 * 60 - inicioTotalMinutos) + fimTotalMinutos;
        }

        // Convertendo de minutos totais para horas e minutos
        int duracaoHoras = duracaoTotalMinutos / 60;
        int duracaoMinutos = duracaoTotalMinutos % 60;

        // Exibindo o resultado
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracaoHoras, duracaoMinutos);

        sc.close();
    }
}
