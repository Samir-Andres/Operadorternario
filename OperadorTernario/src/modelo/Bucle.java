package modelo;

import java.util.List;

public class Bucle {

	public static void main(String[] args) {
		int numero = 10;
		int suma = 0;
		
		for (int i = 0; i < numero; i++) {
			suma +=i;
			System.out.print(i + " ");
			
		}
		System.out.println();
		System.out.print("La asuma es " + suma);
		System.out.println();
     
		int [] [] array = {{23,5,6},{2,3,4},{78,96,6}};
		
		System.out.println();
		System.out.println("Array con el bucle for");
		for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
		System.out.print("["+array[i][j] + "]"+ " ");
		}
		
			System.out.println();
		}
		
		int [] array1 = {2,3,4,5};
		
		System.out.println();
		System.out.println("Array con el bucle for-each");
		for (int i : array1) {
			System.out.print("[" + i + "]"+ " ");
		
			
		}
		System.out.println();
     
		 var frutas = List.of("Mangos", "Pera", "Fresa");
	
		System.out.println();
		 for (String x : frutas) {
			 System.out.println(x.toUpperCase() + " ");
			 
		
			
		}
     	}
	
       

}
