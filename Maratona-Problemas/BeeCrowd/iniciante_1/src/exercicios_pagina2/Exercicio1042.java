package exercicios_pagina2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Exercicio1042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[] numerosForaDeOrdem = {a,b,c};
		int[] numerosEmOrdem = numerosForaDeOrdem.clone();
		
		Arrays.sort(numerosEmOrdem);
		
		for(int valores : numerosEmOrdem) {
			System.out.println(valores);
		}
		
		System.out.println();
		
		for(int valores : numerosForaDeOrdem) {
			System.out.println(valores);
		}
		
		sc.close();
	}

}
