package extractMethod;

/*
 * -> Refactor / Extract Method
 * Crea tres métodos con buenos nombres para los tres pasos
 * que se dan a la hora de formatear el texto
 */
public class FormateoRefactor {

	private String res="";
	
	/*Cree tres metodos como pide el enunciado y un setter cada metodo recibe un string
	 * que le va a hacer una serie de modificaciones y luego le va dar ese valor al atributo RES
	 * mediante el metodo setter(res).
	 * Luego de pasar por los tres metodos , RETURN res.. devuelvo el string que paso ya paso por los tres metodos.
	 * 
	 * */
	
	public String calculaTexto(String texto) {
		eliminarEpaciosConvertirMayusculas(texto);
		eliminarVocales(res);
		eliminarCaracteres(res);
		return res;

	}
	// Primero se eliminan todos los espacios y se ponen en mayúsculas
	public void eliminarEpaciosConvertirMayusculas(String texto) {
		String txt1 = "";
		txt1 = texto.replace(" ", "");
		res = txt1.toUpperCase();
		setRes(res);
		
	}

	// Después se eliminan las vocales
	public void eliminarVocales(String res) {
		String txt2 = "";
		for (int i = 0; i < res.length(); i++) {
			if (!"AEIOU".contains(String.valueOf(res.charAt(i)))) {
				txt2 += res.charAt(i);
			}
		}
		System.out.println(txt2);
		res = txt2;
		setRes(res);
	}
	// Finalmente se eliminan todos los caracteres no alfabéticos
	public void eliminarCaracteres(String res) {
		String txt3 = "";
		for (int i = 0; i < res.length(); i++) {
			if (Character.isAlphabetic(res.charAt(i))) {
				txt3 += res.charAt(i);
			}
		}
		System.out.println(txt3);
		res = txt3;
		setRes(res);
	}
	/**
	 * @param res the res to set
	 */
	public void setRes(String res) {
		this.res = res;
	}
	
}