package modelo;

import static java.lang.String.format;

import java.text.Format;
import java.util.Scanner;

public class CalcularNota {

	public static void main(String[] args) {
//     variables de tipo doubles
		double PrimerNota=0;
		double SegundaNota=0;
		double TerceraNota=0;
		double notadifinitiva = 0;
		int edad =0;
		
//		un Scanner para lee los datos digitados por teclados
		Scanner lector = new Scanner(System.in);
		
//		primer mensaje digitado por teclado
		System.out.println("**Primer nota**");
		PrimerNota = lector.nextInt();
		
//	    primer mensaje digitado por teclado
		System.out.println("**Segunda nota**");
		SegundaNota  = lector.nextInt();
		
//		primer mensaje digitado por teclado
		System.out.println("**Tercera nota**");
		TerceraNota = lector.nextInt();
		
//		primer mensaje digitado por teclado
		System.out.println("**Edad**");
		edad = lector.nextInt();
		
//		El promedio tomado por las tres notas sumadas digitado y dividido por el numero de notas
		notadifinitiva = (PrimerNota + SegundaNota + TerceraNota) / 3;

		
		var CarcularNota = (notadifinitiva >= 350 ) ? "El estudiante esta aprobado " : "El estudiante esta reprobado"; 
		var desc = format ("Su nota es: %.2f y %s con %d años", notadifinitiva, CarcularNota, edad);
		System.out.println(desc);
		System.out.println(CarcularNota + " y su nota difinitiva es " + notadifinitiva  );                                                                       

		lector.close();
				
	}

	
}
