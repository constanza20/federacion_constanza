package entidades;

public class Palmares <T, S> {

	private long id;
	private T medalla;
	private S partipante;
	private Prueba prueba;
	private String observaciones;
	
	public Palmares() {
		
	}

	public Palmares(long id, T medalla, S partipante, Prueba prueba, String observaciones) {
		super();
		this.id = id;
		this.medalla = medalla;
		this.partipante = partipante;
		this.prueba = prueba;
		this.observaciones = observaciones;
	}

	public long getId() {
		return id;
	}

	public T getMedalla() {
		return medalla;
	}

	public S getPartipante() {
		return partipante;
	}

	public Prueba getPrueba() {
		return prueba;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setMedalla(T medalla) {
		this.medalla = medalla;
	}

	public void setPartipante(S partipante) {
		this.partipante = partipante;
	}

	public void setPrueba(Prueba prueba) {
		this.prueba = prueba;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	

	public String mostrarPalmares(){
		return "" + this.id + medalla.toString() + prueba.getNombre() + prueba.getFecha() + prueba.getLugar() + this.getPartipante().getClass();
	}
	
	public void mostrar() {
		System.out.println(this.id + medalla.toString() + prueba.getNombre() + prueba.getFecha() + prueba.getLugar());
	}
}
