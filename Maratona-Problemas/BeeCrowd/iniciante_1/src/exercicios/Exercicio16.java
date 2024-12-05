package exercicios;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura da entrada
        Scanner scanner = new Scanner(System.in);

        // Lê a distância como entrada
        int distancia = scanner.nextInt();

        // Diferença de velocidades entre os carros (em km/h)
        int diferencaVelocidade = 30; // km/h

        // Cálculo do tempo em minutos
        int tempoMinutos = (distancia * 60) / diferencaVelocidade;

        // Exibe o resultado no formato esperado
        System.out.println(tempoMinutos + " minutos");

        // Fecha o scanner
        scanner.close();
    }
}
