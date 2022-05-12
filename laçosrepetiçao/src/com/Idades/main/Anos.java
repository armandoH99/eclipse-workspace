package com.Idades.main;
import java.util.Scanner;

public class Anos
{
    public static void main(String args[]) {
    	
    	Scanner scan = new Scanner(System.in);
		int idade = 0;
		int idade21 = 0;
		int idade50 = 0;
		
		System.out.println("Qual e sua idade:");
		idade = scan.nextInt();
		//colocar o while para encerrar o laço
		
		while(idade !=-99) {
			if (idade < 21)
				idade21++;
			else
				if(idade > 50)
					idade50++;
			try {
				System.out.println("Qual e sua idade:");
				idade = scan.nextInt();
			}
			catch (Exception e) {
				System.err.println("insira somente idade em anos sem ponto!");
			}
		}
		

		System.out.printf("menos de 21: %d, e maiores de 50: %d", idade21, idade50);
		
		scan.close();
    }
}
