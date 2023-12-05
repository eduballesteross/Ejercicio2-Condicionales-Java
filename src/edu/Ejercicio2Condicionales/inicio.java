package edu.Ejercicio2Condicionales;

import java.util.Scanner;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
		
		int resultadoDado;
		
		do {
			
			System.out.println("Introduzca un número del 1 al 6.");
			
			while(!sc.hasNextInt()) {
				
				System.out.println("Introduzca un número entero");
				sc.nextLine();
			}
			
			resultadoDado=sc.nextInt();
			
		if (resultadoDado >1 && resultadoDado>6) {
			
			System.out.println("Introduzca un número correspondiente a los que pueden salir en un dado de 6 caras (1-6).");
		}
			
		}while(resultadoDado >1 && resultadoDado>6);
		
		sc.close();

		switch(resultadoDado) {
		
		case 1: System.out.println("6");
			break;
			
		case 2: System.out.println("5");
		break;
		
		case 3: System.out.println("4");
		break;
		
		case 4: System.out.println("3");
		break;
		
		case 5: System.out.println("2");
		break;
		
		case 6: System.out.println("1");
		break;
		
	
		
		}
	}

}
