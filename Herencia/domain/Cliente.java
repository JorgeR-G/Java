package domain;

import java.util.Date;

public class Cliente extends Persona {
	private int idCliente;
	private Date fechaRegistro;
	private boolean vip;	
	private static int ContadorCliente;
	

public Cliente(String nombre,  char genero, int edad, String direccion,
		Date fechaRegistro, boolean vip) {
	super(nombre, genero, edad, direccion);
	 this.idCliente = ++Cliente.ContadorCliente;
	 this.fechaRegistro = fechaRegistro;
	 this.vip = vip;	
}

public int getIdCliente() {
	return idCliente;
}
public Date getFechaRegistro() {
	return fechaRegistro;
}
public void setFechaRegistro(Date fechaRegistro) {
	this.fechaRegistro = fechaRegistro;
}
public void isVip(boolean vip) {
	this.vip = vip;
}

public void setVip(boolean vip) {
	this.vip = vip;
}

public String toString() {
	 StringBuilder sb = new StringBuilder();
	 sb.append("Clinete(idCliente = ").append(idCliente);
	 sb.append(" ,Persona={ ").append(super.toString()).append("} ");
	 sb.append(" ,fechaRegistro = ").append(fechaRegistro);
	 sb.append(" ,vip = ").append(vip);
	 sb.append(") ");
	return  sb.toString();
}













}
