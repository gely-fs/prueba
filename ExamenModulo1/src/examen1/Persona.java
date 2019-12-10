package examen1;

public class Persona {

	// Declaración de atributos

	private String nombre;
	private String email;

	// Constructores

	public Persona() {

	}

	public Persona(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
	}

	public void imprimirDatos() {

		System.out.println("\n**DATOS DE " + getTipoPersona() +"**" + "\nNOMBRE: " + nombre + "\nemail: " + email);

	}
	
	public String getTipoPersona() {
		return "UNA PERSONA";
	}

	// Getters & Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
