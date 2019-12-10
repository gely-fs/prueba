package examen1;

public class Alumno extends Persona {

	// Declaración de atributos
	
	private int curso;
	private double nota;

	// Constructores

	public Alumno() {
		super();
	}

	public Alumno(String nombre, String email, int curso, double nota) {
		super(nombre, email);
		this.curso = curso;
		this.nota = nota;

	}

	// Getters & Setters

	@Override
	public String getTipoPersona() {
		return "UN ALUMNO";
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

}
