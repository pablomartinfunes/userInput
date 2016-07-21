package com.pmf;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String nombre;
		
		System.out.println("Ingrese su nombre: ");
		nombre = in.next();
		
		System.out.println("Su nombre es " + nombre);

		in.close();
		
	}
}
