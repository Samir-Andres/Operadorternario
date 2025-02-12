package modelo;

public class OperadorTer {
	public static void main(String args []) {
		
		System.out.println("** Operar ternario **");
		
		var edad = 40;
		
		var esMayor = edad >= 18 ?  "Es mayor" : "Es Menor";
		var esAlto = (edad == 40) ? "Es alto" : 0;
		
		System.out.println(esAlto);
		System.out.println(esMayor);
		
		
		var esPar = (edad%2==0) ? "Par" : "Impar";
		System.out.println("La edad es un numero " + esPar);
	}

}
