package exercicios_pagina2;

import java.util.Scanner;

public class Exercicio1061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o dia inicial: ");
        scanner.next(); 
        int diaInicio = scanner.nextInt();

  
        System.out.print("Digite o horário inicial (hh:mm:ss): ");
        int horaInicio = scanner.nextInt();
        int minutoInicio = scanner.nextInt();
        int segundoInicio = scanner.nextInt();

        
        System.out.print("Digite o dia final: ");
        scanner.next(); 
        int diaFim = scanner.nextInt();

    
        System.out.print("Digite o horário final (hh:mm:ss): ");
        int horaFim = scanner.nextInt();
        int minutoFim = scanner.nextInt();
        int segundoFim = scanner.nextInt();


        int inicioEmSegundos = segundoInicio + minutoInicio * 60 + horaInicio * 3600 + diaInicio * 86400;
        int fimEmSegundos = segundoFim + minutoFim * 60 + horaFim * 3600 + diaFim * 86400;

   
        int duracaoTotal = fimEmSegundos - inicioEmSegundos;

        int dias = duracaoTotal / 86400;
        duracaoTotal %= 86400;

        int horas = duracaoTotal / 3600;
        duracaoTotal %= 3600;

        int minutos = duracaoTotal / 60;
        int segundos = duracaoTotal % 60;

     
        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

        scanner.close();
    }
}
