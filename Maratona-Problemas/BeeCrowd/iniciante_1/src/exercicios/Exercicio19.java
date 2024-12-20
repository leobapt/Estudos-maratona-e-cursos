package exercicios;
import java.util.Scanner;

public class Exercicio19{

    public static void main(String[] args) {
        // Cria o scanner para ler a entrada
        Scanner sc = new Scanner(System.in);

        // Lê o valor de segundos
        int N = sc.nextInt();

        // Calcula as horas, minutos e segundos
        int horas = N / 3600;
        int minutos = (N % 3600) / 60;
        int segundos = N % 60;

        // Exibe o resultado no formato horas:minutos:segundos
        System.out.println(horas + ":" + minutos + ":" + segundos);

        // Fecha o scanner
        sc.close();
    }
}
