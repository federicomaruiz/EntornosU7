/**
 * 
 */
package extractClass;

import java.util.Date;

/**
 * @author federicoruiz
 * 17 may 2023 15:54:31
 */
public class Tarjetas {
	
	private String tarjetaCredito;
	private Date fechaTarjetaCredito;
	private int numeroControTarjetaCredito;
	
	public boolean estaCaducada() {
		return fechaTarjetaCredito.before(new Date());
	}
	
	
	public String getCreditCard() {
		return tarjetaCredito;
	}

	public void setCreditCard(String creditCard) {
		this.tarjetaCredito = creditCard;
	}

	public Date getCreditCardDate() {
		return fechaTarjetaCredito;
	}

	public void setCreditCardDate(Date creditCardDate) {
		this.fechaTarjetaCredito = creditCardDate;
	}

	public int getCreditCardControlNumber() {
		return numeroControTarjetaCredito;
	}

	public void setCreditCardControlNumber(int creditCardControlNumber) {
		this.numeroControTarjetaCredito = creditCardControlNumber;
	}

}
