package entidades;

import java.util.Date;

public class Turnos {
	
	private String documento_medico;
	private String fecha_hora;
	private String documento_paciente;
	private String consultorio;
	private String reservado;
	
	public Turnos(String documento_medico, String turno, String consultorio, String reservado) {
		this.documento_medico = documento_medico;
		this.fecha_hora = turno;
		this.consultorio = consultorio;
		this.reservado = reservado;
	}
	
	public String getDocumento_medico() {
		return documento_medico;
	}

	public String getFecha_hora() {
		return fecha_hora;
	}
	public void setFecha_hora(String turno) {
		this.fecha_hora = turno;
	}

	public String getDocumento_paciente() {
		return documento_paciente;
	}
	public void setDocumento_paciente(String documento_paciente) {
		this.documento_paciente = documento_paciente;
	}
	public String getConsultorio() {
		return consultorio;
	}
	public String getReservado() {
		return reservado;
	}
	public void setReservado(String reservado) {
		this.reservado = reservado;
	}
	
	
//TODO: Falta clase completa turnos
}
