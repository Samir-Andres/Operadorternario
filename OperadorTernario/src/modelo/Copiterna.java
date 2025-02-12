package modelo;

import java.util.Scanner;

public class Copiterna {
	public static void main(String args []) {
		int tamaño=0;
		double notas [] = new double [tamaño];
		double notafinal=0;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Digite cuantas notas quiere ingresar");
		tamaño = lector.nextInt();
		
		for (int i = 0; i < notas.length; i++) {
		System.out.println("Digite cuantas notas quiere ingresar");
		notas[i] = lector.nextInt();
			
		notafinal = (notas[i] * tamaño) /3;
		}
		
		var CalcularN = (notafinal >= 350 ) ? "Aprobado" : "Reprobado";
		
		System.out.println(CalcularN + " y su nota es " + notafinal);
		
	}
	

}
