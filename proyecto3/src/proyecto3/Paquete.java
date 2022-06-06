package proyecto3;

import java.util.ArrayList;

public class Paquete {
	
	private String nombre;
	private String descripcion;
	private ArrayList<Actividad> actividades;
	
	public Paquete(String name, String description) {
			this.nombre = name;
			this.descripcion = description;
			this.actividades = new ArrayList<Actividad> ( ); 
			
	}

}
