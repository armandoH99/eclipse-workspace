package com.Par.main;
import java.util.Scanner;

public class ParImpar
{
    public static void main(String args[]) {
    	
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter idade ");
        int a = in.nextInt();
        int b= (a*a);
        
        if ( a % 2 == 0 ) {
        	double R = Math.sqrt(a);
            System.out.println("o valor e par "+R);
        }
         else
        	 System.out.println("o valor e impar "+b);
        		
        
    }
}