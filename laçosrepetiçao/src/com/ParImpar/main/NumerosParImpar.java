package com.ParImpar.main;
import java.util.Scanner;

public class NumerosParImpar
{
    public static void main(String args[]) {
    	
    	Scanner scan = new Scanner(System.in);
		int[] numeros = new int[10];
		int pares = 0;
		int impares = 0;

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println("insira valor do umero:");
				numeros[i] = scan.nextInt();
			}catch (Exception e) {
				System.err.println("somente números inteiros!");
				break;
			}
			if (numeros[i] % 2 == 0)
				pares++;
			else
				impares++;
		}

		System.out.printf("Pares: %d, e Ímpares: %d", pares, impares);
		
		scan.close();
    }
}
