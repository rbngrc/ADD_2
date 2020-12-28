package dam2.add.p2;

import java.io.Serializable;

public abstract class Persona implements Serializable {

	String status;
	String nombre;
	int dia;
	int mes;
	String grupo;

	public Persona(String status, String nombre, int dia, int mes, String grupo) {
		super();
		this.status = status;
		this.nombre = nombre;
		this.dia = dia;
		this.mes = mes;
		this.grupo = grupo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

}
