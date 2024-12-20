// Declara o pacote do programa
package exercicios;

// Importa a classe Scanner para permitir a entrada de dados pelo teclado
import java.util.Scanner;

public class Exercicio3 {

    // Método principal (ponto de entrada do programa)
    public static void main(String[] args) {
        // Cria uma instância da classe Scanner para capturar a entrada de dados do usuário
        Scanner sc = new Scanner(System.in);
        
        // Declara uma variável para armazenar o valor do raio fornecido pelo usuário
       
        double raio = sc.nextDouble();
        
        // Define o valor da constante PI, que será usada no cálculo da área
        double pi = 3.14159;

        // Calcula a área do círculo
        double area = pi * raio * raio;
        
        // Exibe o resultado do cálculo no formato "A= <área>"
        System.out.printf("A=%.4f%n", area); // Formata o valor com 4 casas decimais

        // Fecha o Scanner para liberar os recursos utilizados
        sc.close();
    }
}
