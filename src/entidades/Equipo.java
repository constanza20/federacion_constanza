package entidades;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Equipo extends Participante {
	private long idEquipo;
	private int anioinscripcion;
	private Manager manager;
	private Atleta[] atletas;

	public Equipo(long id, int anioinscripcion, Manager manager, Atleta[] atletas) {
		super();
		this.idEquipo = id;
		this.anioinscripcion = anioinscripcion;
		this.manager = manager;
		this.atletas = atletas;
	}

	public Equipo(long idParticipante, Equipo e, int dorsal, char calle) {
		super(idParticipante, dorsal, calle);
		this.idEquipo = e.idEquipo;
		this.anioinscripcion = e.anioinscripcion;
		this.manager = e.manager;
		this.atletas = e.atletas;
	}

	@Override
	public long getId() {
		return idEquipo;
	}
	@Override
	public void setId(long id) {
		this.idEquipo = id;
	}
	public int getAnioinscripcion() {
		return anioinscripcion;
	}
	public void setAnioinscripcion(int anioinscripcion) {
		this.anioinscripcion = anioinscripcion;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public Atleta[] getAtletas() {
		return atletas;
	}
	public void setAtletas(Atleta[] atletas) {
		this.atletas = atletas;
	}

	//Ejercicio 3
	@Override
	public String toString() {
		String ret = "";
		ret+= "EQ"+idEquipo + ". de " + manager.getPersona().getNombre() + " (" + manager.getDireccion()+") " + atletas.length + " componentes en el equipo:\n";
		for(Atleta a: atletas) {
			ret += a.getId()+". " + a.getPersona().getNombre() + "(" + a.getPersona().getFechaNac().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+ ") "
					+ " Datos físicos:\t"+ a.getPeso()+ "Kgs.\t" + a.getAltura()+"m.\n";
		}
		ret += "Valido durante el " + anioinscripcion;
		return ret;
	}
	
	
	public static Equipo nuevoEquipo() {
		  
	    Equipo ret = null;
		long id = -1;
		int anioinscripcion;
		DatosPersona dp = null;
		Scanner in;
		boolean valido = false;
		do {
			System.out.println("Introduzca el id del nuevo atleta:");
			in = new Scanner(System.in);
			id = in.nextInt();
			if (id > 0)
				valido = true;
			else
				System.out.println("Valor incorrecto para el identificador.");
		} while (!valido);

		valido = false;


		System.out.println("Introduzca ahora los datos personales:");
		in = new Scanner(System.in);
		dp = DatosPersona.nuevaPersona();

		
		return ret;
	}
	
	


}
