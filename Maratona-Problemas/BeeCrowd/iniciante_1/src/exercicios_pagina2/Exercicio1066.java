package exercicios_pagina2;
import java.util.Scanner;
public class Exercicio1066 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] valores = new int[5];
		int pares = 0;
		int impar = 0;
		int positivo = 0;
		int negativo = 0;
		
		for(int i = 0; i < 5; i++) {
			valores[i] = sc.nextInt();
			if(valores[i] % 2 == 0) {
				pares++;
			}else {
				impar++;
			}if(valores[i] > 0) {
				positivo++;
			}else if(valores[i] < 0) {
				negativo++;
			}
		}
		
		 System.out.println(pares +" valor(es) par(es)");
		 System.out.println(impar +" valor(es) impar(es)");
		 System.out.println(positivo +" valor(es) positivo(s)");
		 System.out.println(negativo +" valor(es) negativo(s)");
		sc.close();
	}

}
