package dam2.add.p2;

public class Profesor extends Persona {

	String asignatura;

	public Profesor(String status, String nombre, int dia, int mes, String grupo, String asignatura) {
		super(status, nombre, dia, mes, grupo);
		this.asignatura = asignatura;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

}
