package explainingVariable;

class ClienteRefactor {
	private int edad;
	private float salario;

	public ClienteRefactor(int edad, float salario) {
		this.edad = edad;
		this.salario = salario;
	}
	
	/**
	 * Cree tres variable para resolverlo con operaciones mas simples , una operacion por linea y que luego
	 * al ver el IF sea mas legible lo que esta sucediendo.
	 * 
	 * */
	public float calculaDescuento(float cantidadTotal) {
		float porcentajeSalario = (salario * 0.5f);
		float restoSalario = salario - porcentajeSalario;
		float porcentajeCantidadTotal = (cantidadTotal * 0.5f);
		if ((edad >= 18 && edad <= 65) && (restoSalario < 1200f && porcentajeCantidadTotal < 500)) {
			return cantidadTotal * 0.9f;
		} else {
			return cantidadTotal;
		}
	}

}
