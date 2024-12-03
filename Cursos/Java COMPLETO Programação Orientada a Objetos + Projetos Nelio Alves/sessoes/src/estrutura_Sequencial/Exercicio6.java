package estrutura_Sequencial;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.000");

        try {
            // Leitura dos valores A, B e C
            System.out.print("Digite o valor de A: ");
            double A = sc.nextDouble();
            
            System.out.print("Digite o valor de B: ");
            double B = sc.nextDouble();
            
            System.out.print("Digite o valor de C: ");
            double C = sc.nextDouble();

            // Cálculos das áreas
            double areaTriangulo = (A * C) / 2.0;
            double areaCirculo = 3.14159 * Math.pow(C, 2);
            double areaTrapezio = ((A + B) * C) / 2.0;
            double areaQuadrado = Math.pow(B, 2);
            double areaRetangulo = A * B;

            // Exibição dos resultados
            System.out.println("TRIANGULO: " + df.format(areaTriangulo));
            System.out.println("CIRCULO: " + df.format(areaCirculo));
            System.out.println("TRAPEZIO: " + df.format(areaTrapezio));
            System.out.println("QUADRADO: " + df.format(areaQuadrado));
            System.out.println("RETANGULO: " + df.format(areaRetangulo));

        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de digitar números corretamente.");
        } finally {
            sc.close();
        }
    }
}
