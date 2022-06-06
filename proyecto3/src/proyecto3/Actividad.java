package proyecto3;

import java.util.ArrayList;

public class Actividad {
	private ArrayList<Tarea> tareas; 
	private String nombreacti;
	private String descripcion;
	
	public Actividad(String nombreacti, String description ) {
		this.nombreacti = nombreacti;
		this.descripcion = description;
		
		tareas = new ArrayList<Tarea>();
		
	}
	public void anadirtarea (String name, String description, String type, int time, String nombrec, String correoc ) {
		Tarea task = new Tarea(name, description,type, time, nombrec,correoc);
		tareas.add(task);
	}
	public int tiempoactividadesperado() {
	 int time = 0;
	 for (Tarea i : tareas) {
		 time += i.gettiempo();
	 }
	return time;
	
	}
	
	public String getnombre() {
		return nombreacti;
	}
	public int tiemporeal() {
		int realtime = 0;
		 boolean status = false;
		 for (Tarea i : tareas) {
			 status = i.getsetcomplete();
			 if (status == true) {
				 realtime += i.gettimex();
			 }
		 }
		return realtime;
		
		}
	public void showparticipants ()
	{
		dueno participante = null;
		for (Tarea i : tareas) {
			participante = i.getcreador();
			System.out.print(participante.getnombre());
			
		}
		
	}

}
