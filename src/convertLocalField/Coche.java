package convertLocalField;

/*
 * -> Refactor / Convert Local Variable to Field...
 * Seleccionad la variable local kilometros y convertirla en Atributo
 * Elegid la opción de inicializarla en el constructor
 */

public class Coche {

	private int kilometros; // Converti la varible local kilometros en un atributo
	
	/**
	 * @param kilometros
	 * 
	 * Genere el constructor donde inicializo el atributo kilometros
	 */
	public Coche(int kilometros) {
		this.kilometros = kilometros;
	}


	public void conducir (int distancia) {
		kilometros += distancia;
	}
	
}
