package examen1;

public class Application {

	public static void main(String[] args) {

		// Declaraci�n de variables
		int longitudArray = 3;
		Alumno[] listaAlumnos = new Alumno[longitudArray];

		// Creo varios alumnos

		Alumno alumno1 = new Alumno("Mart�n", "martin@capgemini.com", 1, 9.5);
		Alumno alumno2 = new Alumno("Gely", "gely@capgemini.com", 1, 9);
		Alumno alumno3 = new Alumno("Jose", "jose@capgemini.com", 5, 10);
		Alumno alumno4 = new Alumno("Sof�a", "sofia@capgemini.com", 2, 8);

		// Creo una asignatura

		Asignatura asignatura1 = new Asignatura("Java", 290, listaAlumnos);

		// Llamo al m�todo a�adir alumnos para la asignatura creada

		System.out.println(".....M�TODO A�ADIR ALUMNO.....\n");
		
		asignatura1.addAlumno(alumno1);
		asignatura1.addAlumno(alumno2);
		asignatura1.addAlumno(alumno3);
		asignatura1.addAlumno(alumno4);

		// Llamo al m�todo buscar alumno
		System.out.println("\n\n.....M�TODO BUSCAR ALUMNO.....");
		
		Alumno alumnoBuscado = asignatura1.buscarAlumno("Gely");
		if (alumnoBuscado != null) {
			alumnoBuscado.imprimirDatos();
		}

		alumnoBuscado = asignatura1.buscarAlumno("Pepe");
		if (alumnoBuscado != null) {
			alumnoBuscado.imprimirDatos();
		}

		alumnoBuscado = asignatura1.buscarAlumno("Carlos");
		if (alumnoBuscado != null) {
			alumnoBuscado.imprimirDatos();
		}

		alumnoBuscado = asignatura1.buscarAlumno("Mart�n");
		if (alumnoBuscado != null) {
			alumnoBuscado.imprimirDatos();
		}


		// Llamo al m�todo imprimirAlumnos
		
		System.out.println("\n\n.....M�TODO IMPRIMIR DATOS DE ALUMNOS.....");
		
		asignatura1.imprimirAlumnos();

		// Llamo al m�todo que me imprime los datos de un profesor. Creo profesores

		Profesor p1 = new Profesor("�lvaro", "alvaro@capgemini.com", asignatura1);

		Asignatura asignatura2 = new Asignatura("BBDD", 180, listaAlumnos);

		Profesor p2 = new Profesor("Carlos", "carlos@capgemini.com", asignatura2);
		
		System.out.println("\n\n.....M�TODO IMPRIMIR DATOS DE PROFESORES.....");
		
		p1.imprimirDatos();
		p2.imprimirDatos();

	}

}
