package pushDown;

/*
 * Añadi el atributo insurance y plate (seguro y matricula) , tambien le metodo arrancar.
 * */
public class Coche extends Vehiculo {
	private String maletero;
	private boolean abiertoMaletero;
	protected Seguro insurance;
	protected String plate;
	

	public boolean estaAbiertoMaletero() {
		return abiertoMaletero;
	}
	
	public String arrancar() {
		return "Brummm, brummm";
	}
}