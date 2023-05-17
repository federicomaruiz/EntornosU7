package extractConstant;

/*
 * -> Refactor/Extract Constant
 * Crea un atributo privado y constante IVA para sustituir el valor 21
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 */

public class PVPRefactor {
	// Creo dentro de la clase el atributo , constante IVA (con mayusculas )
	// Luego lo reemplazo por el 21.
	private final int IVA = 21;
	public double calculaPVP(double precio) {
		double impuestos = (precio * IVA) / 100;
		return precio + impuestos;
	}
}
