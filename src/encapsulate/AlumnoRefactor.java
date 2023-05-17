package encapsulate;

/*
 *->  Refactor / Encapsulate Field
 * Los atributos nombre y nota deben ser privados
 * El método mayorIgual5 debe ser privado
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 */
public class AlumnoRefactor {
	private String nombre; // Cambie el stributo nombre y nota a privados
	private int nota;

	public AlumnoRefactor(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	public boolean estaAprobado() {
		return mayorIgual5();
	}

	private boolean mayorIgual5() {  // Cambie el metodo a private
		return nota >= 5;
	}
}
