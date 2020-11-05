package es.studium.Potencia;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		int base,exp,resultado,i;
		resultado=1;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un número para la base ");
		base = teclado.nextInt();
		System.out.println("Dame un número para el exponente ");
		exp = teclado.nextInt();
		teclado.close();
		for(i=1;i<=exp;i++)
		{
		resultado=base*resultado;
		}				
		System.out.println("El munero " + base + " elevado a " + exp + " es  " + resultado);
	}
}
