package exercicios_pagina2;
import java.util.Scanner;

public class Exercicio1052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o número inteiro entre 1 e 12
        int mes = sc.nextInt();

        // Array com os nomes dos meses em inglês
        String[] meses = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };

        // Verifica se o valor está dentro do intervalo válido
        if (mes >= 1 && mes <= 12) {
            System.out.println(meses[mes - 1]);
        }

        sc.close();
    }
}
