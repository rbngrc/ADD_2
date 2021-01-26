package dam2.add.p2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Operaciones {

	File miFile;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	FileInputStream fis = null;
	FileOutputStream fos = null;
	int aleatorio = (int) (Math.random() * 101);

	ArrayList<Persona> listaPersona = new ArrayList<Persona>();

	Scanner sc = new Scanner(System.in);

	public void anadirPersona(ArrayList<Persona> listaPersona) {
		miFile = new File("ficheros/personas.dat");
		boolean running = true;
		String matricula = "M" + aleatorio;

		while (running) {
			System.out.println("Indique si es Alumno o Profesor");
			String status = sc.nextLine();

			if (status.equalsIgnoreCase("alumno")) {
				System.out.println("Nombre del alumno: (por ejemplo: Jose Lopez)");
				String nombre = sc.nextLine();
				System.out.println("Dia de nacimiento: (por ejemplo: 31)");
				int dia = sc.nextInt();
				System.out.println("Mes de nacimiento: (por ejemplo: 12)");
				int mes = sc.nextInt();
				System.out.println("Grupo al que pertenece: (por ejemplo: A)");
				sc.nextLine();
				String grupo = sc.nextLine();

				Alumno alumno = new Alumno(status, nombre, dia, mes, grupo, matricula);
				listaPersona.add(alumno);
				System.out.println("Anadido correctamente");
				System.out.println("*********************\n");

			} else if (status.equalsIgnoreCase("profesor")) {
				System.out.println("Nombre del profesor: (por ejemplo: Jose Lopez)");
				String nombre = sc.nextLine();
				System.out.println("Dia de nacimiento: (por ejemplo: 31)");
				int dia = sc.nextInt();
				System.out.println("Mes de nacimiento: (por ejemplo: 12)");
				int mes = sc.nextInt();
				System.out.println("Asignatura que imparte: (por ejemplo: Matematicas)");
				sc.nextLine();
				String asignatura = sc.nextLine();
				System.out.println("Grupo al que imparte clase: (por ejemplo: A)");
				String grupo = sc.nextLine();

				Profesor profesor = new Profesor(status, nombre, dia, mes, grupo, asignatura);
				listaPersona.add(profesor);
				System.out.println("Anadido correctamente");
				System.out.println("*********************\n");
			} else {
				System.out.println("Ha habido un error");
			}

			System.out.println("desea continuar? Si/No");
			String continuar = sc.nextLine();

			if (continuar.equalsIgnoreCase("no")) {
				System.out.println("\n");
				break;
			}
		}

		System.out.println("Estos son los nuevos usuarios dados de alta");

		for (Persona o : listaPersona) {
			if (((Persona) o).getStatus().equalsIgnoreCase("profesor")) {
				System.out.println(((Persona) o).getStatus().toUpperCase() + " " + ((Persona) o).getNombre() + ", "
						+ ((Persona) o).getDia() + " del " + ((Persona) o).getMes() + ", "
						+ ((Profesor) o).getAsignatura() + ", " + ((Persona) o).getGrupo().toUpperCase());
			} else {
				System.out.println(((Persona) o).getStatus().toUpperCase() + " " + ((Persona) o).getNombre() + ", "
						+ ((Persona) o).getDia() + " del " + ((Persona) o).getMes() + ", " + ((Alumno) o).getMatricula()
						+ ", " + ((Persona) o).getGrupo().toUpperCase());
			}
		}

		grabarPersona(listaPersona);
	}

	public void grabarPersona(ArrayList<Persona> listaPersona) {

		miFile = new File("ficheros/personas.dat");

		if (miFile.exists()) {

			ObjectInputStream ois = null;
			try {
				ois = new ObjectInputStream(new FileInputStream(miFile));

				while (true) {
					Persona per = (Persona) ois.readObject();
					listaPersona.add(per);
				}
			} catch (EOFException e) {
				System.out.println("Leyendo fichero");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

		miFile = new File("ficheros/personas.dat");

		oos = null;

		try {
			fos = new FileOutputStream(miFile);
			oos = new ObjectOutputStream(fos);
			for (int i = 0; i < listaPersona.size(); i++) {
				Persona personas = listaPersona.get(i);
				System.out.println(personas.getNombre());
				oos.writeObject(personas);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		listaPersona.clear();

	}

	public void listarPersona(ArrayList<Persona> listaPersona) {

		miFile = new File("ficheros/personas.dat");

		if (miFile.exists()) {

			ObjectInputStream ois = null;
			try {
				ois = new ObjectInputStream(new FileInputStream(miFile));

				while (true) {
					Persona per = (Persona) ois.readObject();
					listaPersona.add(per);
				}
			} catch (EOFException e) {
				System.out.println("Leyendo fichero");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

		for (Persona o : listaPersona) {
			if (((Persona) o).getStatus().equalsIgnoreCase("profesor")) {
				System.out.println(((Persona) o).getStatus().toUpperCase() + " " + ((Persona) o).getNombre() + ", "
						+ ((Persona) o).getDia() + " del " + ((Persona) o).getMes() + ", "
						+ ((Profesor) o).getAsignatura() + ", " + ((Persona) o).getGrupo().toUpperCase());
			} else {
				System.out.println(((Persona) o).getStatus().toUpperCase() + " " + ((Persona) o).getNombre() + ", "
						+ ((Persona) o).getDia() + " del " + ((Persona) o).getMes() + ", " + ((Alumno) o).getMatricula()
						+ ", " + ((Persona) o).getGrupo().toUpperCase());
			}
		}

		listaPersona.clear();

	}

	public void felicitarPersonas(ArrayList<Persona> listaPersona) {

		System.out.println("Dia de nacimiento: (por ejemplo: 31)");
		int dia = sc.nextInt();
		System.out.println("Mes de nacimiento: (por ejemplo: 12)");
		int mes = sc.nextInt();

		miFile = new File("ficheros/personas.dat");

		if (miFile.exists()) {

			ObjectInputStream ois = null;
			try {
				ois = new ObjectInputStream(new FileInputStream(miFile));

				while (ois != null) {
					Persona per = (Persona) ois.readObject();
					listaPersona.add(per);
				}
			} catch (EOFException e) {
				System.out.println("Leyendo fichero");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

		for (int i = 0; i < listaPersona.size(); i++) {
			Persona per = listaPersona.get(i);
			if (((Persona) per).getDia() == dia && ((Persona) per).getMes() == mes) {
				System.out.println(
						"FELICIDADES " + ((Persona) per).getStatus().toLowerCase() + " " + ((Persona) per).getNombre());
			}
		}

		listaPersona.clear();

	}

}
