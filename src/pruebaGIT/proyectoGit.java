package pruebaGIT;

import java.util.Scanner;

public class proyectoGit {
	public static void main(String[] args) {
		Integer numero = null;
		Scanner teclado = new Scanner(System.in);
		numero=teclado.nextInt();
		HolaMundo(numero);
		
		
	}
	
	public static void HolaMundo(Integer numero) {
		System.out.println("Hola Mundo "+ numero);
		
	}
}
