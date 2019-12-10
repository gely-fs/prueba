package examen1;

public class Asignatura {

	// Declaración de atributos

	private String nombre;
	private int numHoras;
	private Alumno[] listaAlumnos;

	// Constructores

	public Asignatura() {
		listaAlumnos = new Alumno[100];
	}

	public Asignatura(String nombre, int numHoras, Alumno[] listaAlumnos) {
		this.nombre = nombre;
		this.numHoras = numHoras;
		if (listaAlumnos != null) {
			this.listaAlumnos = listaAlumnos;
		} else {
			this.listaAlumnos = new Alumno[100];
		}
	}

	// Método addAlumno

	public void addAlumno(Alumno alumnoNuevo) {

		for (int i = 0; i < listaAlumnos.length; i++) {
			if (listaAlumnos[i] == null) {
				listaAlumnos[i] = alumnoNuevo;
				System.out.println("Alumno" + (i + 1) + ": " + alumnoNuevo.getNombre() + " añadido correctamente");
				return;
			}
		}

		System.out.println("\nEsta asignatura no admite más alumnos");
	}

	// Método buscar alumnos por nombre para una asignatura dada, y que me dé nombre
	// + email

	public Alumno buscarAlumno(String nombreAlumno) {

		for (int i = 0; i < listaAlumnos.length; i++) {

			if (listaAlumnos[i] != null && listaAlumnos[i].getNombre().equals(nombreAlumno)) {
				return listaAlumnos[i];
			}

		}

		System.out.println("\nNo se ha encontrado a nadie con el nombre: " + nombreAlumno);

		return null;
	}

	// Método imprimir la lista completa de nombre + email de alumnos de la
	// asignatura a la que se aplique

	public void imprimirAlumnos() {
		for (int i = 0; i < listaAlumnos.length; i++) {
			System.out.println("\n**DATOS DEL ALUMNO**" + "\nNOMBRE: " + listaAlumnos[i].getNombre() + "\nemail: "
					+ listaAlumnos[i].getEmail() + "\nCURSO: " + listaAlumnos[i].getCurso());

		}

	}

	// Getters & Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	public Alumno[] getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(Alumno[] listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

}
