package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.primefaces.event.SelectEvent;



public class createBean {
	private Date fecha;
	private String fechaString;
	private String nuevaPregunta;
	private double apuestaMinima;
	
	public createBean() {}
	
	public String getNuevaPregunta() {
		return nuevaPregunta;
	}
	public void setNuevaPregunta(String nuevaPregunta) {
		this.nuevaPregunta = nuevaPregunta;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public String getFechaString() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(fecha);
	}
	public void setFechaString(String fechaString) {
		this.fechaString = fechaString;
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
	public void onDateSelect(SelectEvent evento) {
		this.fecha = (Date) evento.getObject();
	}
}
