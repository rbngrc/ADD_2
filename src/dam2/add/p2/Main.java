package dam2.add.p2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		menuPrincipal();

	}

	public static void menuPrincipal() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Persona> listaPersona = new ArrayList<Persona>();
		Operaciones operacion = new Operaciones();

		boolean salir = false;
		int opcion;

		while (!salir) {

			System.out.println("MENU");
			System.out.println("1 - Añadir Persona");
			System.out.println("2 - Felicitar");
			System.out.println("3 - Listar");
			System.out.println("4 - Guardar");
			System.out.println("5 - Salir");

			try {
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
					System.out.println("Se ha guardado correctamente");
					break;
				case 5:
					salir = true;
					break;
				default:
					System.out.println("\nElije del 1 al 5\n");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("\nDebe insertar un numero\n");
			}
		}
	}

}
