package pullUp;

/*
 * Subi a la superClase vehiculo el atributo matricula y el metodo arrancar
 * */
public class Vehiculo {
	protected String modelo;
	private String matricula;
	
	public String arrancar() {
		return "Brummm, brummm";
	}
}