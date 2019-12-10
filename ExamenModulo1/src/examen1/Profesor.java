package examen1;

public class Profesor extends Persona {

	// Declaración de atributos

	private Asignatura asignaturaImpartida;

	// Constructores
	/*
	 * public Profesor() { super(); }
	 */

	public Profesor(String nombre, String email, Asignatura asignaturaImpartida) {
		super(nombre, email);
		this.asignaturaImpartida = asignaturaImpartida;
	}

	// POLIMORFISMO

	@Override
	public void imprimirDatos() {
		super.imprimirDatos();
		System.out.println("ASIGNATURA IMPARTIDA: " + asignaturaImpartida.getNombre());
	}

	@Override
	public String getTipoPersona() {
		return "UN PROFESOR";
	}

	// Getters & Setters

	public Asignatura getAsignaturaImpartida() {
		return asignaturaImpartida;
	}

	public void setAsignaturaImpartida(Asignatura asignaturaImpartida) {
		this.asignaturaImpartida = asignaturaImpartida;
	}

}
