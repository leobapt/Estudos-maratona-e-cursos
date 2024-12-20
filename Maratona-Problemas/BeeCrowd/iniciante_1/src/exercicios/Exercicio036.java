package exercicios;
import java.util.Scanner;

public class Exercicio036 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos valores A, B e C
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // Cálculo do discriminante (Delta)
        double delta = (B * B) - (4 * A * C);

        // Verificação das condições
        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            // Cálculo das raízes
            double R1 = (-B + Math.sqrt(delta)) / (2 * A);
            double R2 = (-B - Math.sqrt(delta)) / (2 * A);

            // Impressão das raízes com 5 casas decimais
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }

        sc.close();
    }
}
