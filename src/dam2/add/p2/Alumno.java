package dam2.add.p2;

public class Alumno extends Persona {

	String matricula;

	public Alumno(String status, String nombre, int dia, int mes, String grupo, String matricula) {
		super(status, nombre, dia, mes, grupo);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
