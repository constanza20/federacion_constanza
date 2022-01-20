package entidades;

import java.time.LocalDate;
import java.util.Scanner;

import utils.Datos;
import utils.Utilidades;

public class Manager {
	private long id;
	private String telefono;
	private String direccion;

	private DatosPersona persona;

	public Manager(long id, String telefono, String direccion) {
		super();
		this.id = id;
		this.telefono = telefono;
		this.direccion = direccion;
		this.persona = Datos.buscarPersonaPorId(id);
	}

	public Manager(long id, String telefono, String direccion, DatosPersona dp) {
		super();
		this.id = id;
		this.telefono = telefono;
		this.direccion = direccion;
		this.persona = dp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public DatosPersona getPersona() {
		return this.persona;
	}

	public static Manager nuevoManager() {
	
		Manager ret = null;
		Scanner in;
		long id = -1;
		String nombre = "";
		String tfn = "";
		boolean valido = false;
		
		do {
			System.out.println("Introduzca el id del nuevo Manager:");
			in = new Scanner(System.in);
			id = in.nextInt();
			if (id > 0)
				valido = true;
		} while (!valido);
		valido = false;
		
		do {
			System.out.println("Introduzca el nombre del nuevo Manager:");
			in = new Scanner(System.in);
			nombre = in.nextLine();
			if (nombre.length() > 3)
				valido = true;
		} while (!valido);
		
		do {
			System.out.println("Introduzca el telefono del nuevo Manager:");
			in = new Scanner(System.in);
			tfn = in.nextLine();
			if (tfn.length() > 3)
				valido = true;
		} while (!valido);
		System.out.println("Introduzca la fecha de nacimiento del Manager");
		LocalDate fecha = Utilidades.leerFecha();
	
	return ret;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", telefono=" + telefono + ", direccion=" + direccion + ", persona=" + persona
				+ "]";
	}

	
	
	

}
