package pushDown;

/* Añadi el atributo insurance y plate (seguro y matricula) , tambien le metodo arrancar.  */
public class Moto extends Vehiculo {
	private String tipo;
	protected Seguro insurance;
	protected String plate;
	
	public String arrancar() {
		return "Brummm, brummm";
	}
}
