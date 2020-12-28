package dam2.add.p2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		menuPrincipal();
		
	}
	
	public static void menuPrincipal() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Persona> listaPersona = new ArrayList<Persona>();
		Operaciones operacion = new Operaciones();

		int opcion;

		do {

			System.out.println("MENU");
			System.out.println("1 - Añadir Persona");
			System.out.println("2 - Felicitar");
			System.out.println("3 - Listar");
			System.out.println("4 - Grabar");
			System.out.println("5 - Fin");
			System.out.println("Introduzca una opcion: ");

			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				operacion.anadirPersona(listaPersona);
				break;
			case 2:
				operacion.felicitarPersonas(listaPersona);
				break;
			case 3:
				operacion.listarPersona(listaPersona);
				break;
			case 4:
				// TODO
				operacion.grabarPersona(listaPersona);
				break;
			default: 
				System.out.println("\nElije del 1 al 5\n");
				break;
			}
		} while (opcion != 5);
	}

}
