package exercicios;
import java.util.Scanner;

public class Exercicio1020 {

    public static void main(String[] args) {
        // Cria uma instância para capturar informações
        Scanner sc = new Scanner(System.in);
        
        int diasTotais = sc.nextInt();
        
        // Array para guardar os valores de dias em um ano e mês
        final int[] unidadesTempo = {365, 30};
        
        int[] resultado = new int[3]; // resultado[0] para anos, resultado[1] para meses e resultado[2] para dias
        
        // Calcula a quantidade de anos e meses
        for (int i = 0; i < unidadesTempo.length; i++) {
            if (i == 0) {
                // Calcula os anos
                resultado[i] = diasTotais / unidadesTempo[i];
                diasTotais %= unidadesTempo[i];
            } else {
                // Calcula os meses
                resultado[i] = diasTotais / unidadesTempo[i];
                diasTotais %= unidadesTempo[i];
            }
        }
        
        // O que restar são os dias
        resultado[2] = diasTotais;
        
        // Exibe o resultado no formato adequado
        System.out.println(resultado[0] + " ano(s)");
        System.out.println(resultado[1] + " mes(es)");
        System.out.println(resultado[2] + " dia(s)");
        
        sc.close();
    }
}
