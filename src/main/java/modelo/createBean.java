package modelo;

import java.util.Date;



public class createBean {
	private Date fecha;
	private String nuevaPregunta;
	private double apuestaMinima;
	
	public createBean() {
		this.fecha = new Date();
		this.nuevaPregunta = new String();
	}
	
	public String getNuevaPregunta() {
		return nuevaPregunta;
	}
	public void setNuevaPregunta(String nuevaPregunta) {
		this.nuevaPregunta = nuevaPregunta;
	}
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getApuestaMinima() {
		return apuestaMinima;
	}
	public void setApuestaMinima(Double apuestaMinima) {
		this.apuestaMinima = apuestaMinima;
	}
}
