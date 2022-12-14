package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.primefaces.event.SelectEvent;

import domain.Event;
import modelo.dominio.DataAccessJSF;



public class createBean {
	private Date fecha;
	private String fechaString;
	private String nuevaPregunta;
	private double apuestaMinima;
	private DataAccessJSF da = new DataAccessJSF();
	private List<Event> eventos = new ArrayList<Event>();
	
	
	public createBean() {
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
	public DataAccessJSF getDa() {
		return da;
	}

	public void setDa(DataAccessJSF da) {
		this.da = da;
	}
	public List<Event> getEventos() {
		return da.getEvents(fecha);
	}

	public void setEventos(List<Event> eventos) {
		this.eventos = eventos;
	}
	public void onDateSelect(SelectEvent evento) {
		this.fecha = (Date) evento.getObject();
	}
}
