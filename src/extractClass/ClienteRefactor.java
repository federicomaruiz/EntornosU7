package extractClass;

import java.util.Date;

/*
 * Saque los atributos tarjeta de credito, fecha tarjeta de credito , y numero control tarjeta de credito
 * y los meti en otra clase que se llama tarjeta con sus metodos getters y setters, en esta clase solo deje el cliente
 * con su dni y nombre.
 * */

public class ClienteRefactor {
	private String nombre;
	private String dni;
	
	public ClienteRefactor(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public boolean esValidoDni() {
		boolean result = true;
		for (char c : dni.toCharArray()) {
			if (!Character.isDigit(c)) {
				result = false;
			}
		}
		return result;
	}

	public String getName() {
		return nombre;
	}

	public void setName(String name) {
		this.nombre = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}