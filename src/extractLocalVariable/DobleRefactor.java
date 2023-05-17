package extractLocalVariable;

/*
 * -> Refactor/Extract Local Variable
 * Crea una variable local "doble" con el valor de 2
 * Luego ejecuta el Test JUnit para comprobar que es correcto 
 */
public class DobleRefactor {
	public int calculaDoble(int valor) {
		int doble = 2; // Creo la variable de tipo int que se llama "doble" le asigno el valor de 2 y en donde estaba return 2 * valor
		return doble * valor;  // remplazo el 2 con la variable
	}
}
