package com.Idade.main;
import java.util.Scanner;

public class IdadeGrupo
{
    public static void main(String args[]) {
    	
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        

        
        if (a <= 14) {
        	System.out.println("esta no grupo infantil");}
        if (a >14 && a <=17) {
        	System.out.println("esta no grupo juvenil");}
        if (a >17 && a <=25) {
        	System.out.println("esta no grupo adulto");}
        if (a < 25){
        	System.out.println("esta no grupo idoso");
        }
       
        
        
    }
}
