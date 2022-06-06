package proyecto3;

import java.util.ArrayList;

public class proyecto {

	private String nombre;
	private String descripcion;
	private dueno participante;
	private ArrayList<Actividad> actividades;
	
	
	
	public proyecto(String name, String description, String namep, String correo){
	
		this.nombre = name;
		this.descripcion  = description;
		this.participante  = new dueno(namep, correo);
		
	}
	public void anadiractividad(Actividad acti) {
		
		actividades.add(acti);
	}
	public ArrayList<Actividad> getactividad(){
		return actividades;
		
	}
	
	

}
