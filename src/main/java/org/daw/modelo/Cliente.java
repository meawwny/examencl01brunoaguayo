package org.daw.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "Cliente")
public class Cliente {
	
	// Attribute
	@Id
	private String Id;
	private String Nombre;
	private String Apellido;
	private String Email;
	private Date fechaNac;
	private int Dni;
	
		
	// Constructor
	public Cliente() {
	}

	public Cliente(String id, String nombre, String apellido, String email, Date fechaNac, int dni) {
		this.Id = id;
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Email = email;
		this.fechaNac = fechaNac;
		this.Dni = dni;
	}


	// Get - set
	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getNombre() {
		return Nombre;
	}




	public void setNombre(String nombre) {
		Nombre = nombre;
	}




	public String getApellido() {
		return Apellido;
	}




	public void setApellido(String apellido) {
		Apellido = apellido;
	}




	public String getEmail() {
		return Email;
	}




	public void setEmail(String email) {
		Email = email;
	}




	public Date getFechaNac() {
		return fechaNac;
	}




	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}




	public int getDni() {
		return Dni;
	}


	public void setDni(int dni) {
		Dni = dni;
	}


}
