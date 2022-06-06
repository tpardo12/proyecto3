package proyecto3;

public class Tarea {
	private  String nombre;
	private String descripcion;
	private String tipo;
	private boolean iscomplete;
	private int tiempo; 
	private int timex;
	private dueno creador;
	

	public Tarea(String name, String description, String type, int time, String nombrec, String correoc) {
		// TODO Auto-generated constructor stub
		this.nombre = name;
		this.descripcion = description;
		this.tipo = type;
		this.iscomplete = false;
		this.tiempo = time;
		this.creador = new dueno(nombrec,correoc);
	}
	public int gettiempo() {
		return tiempo;
		
	}
	public boolean getsetcomplete() {
		return iscomplete;
	}
	
	public int gettimex() {
		return timex;
	}
	
	public dueno getcreador(){
		
		return creador;
	}
	public int setcomplete(int timetaken) {
		int realtime = 0;
		iscomplete = true;
		realtime = timetaken - tiempo ;
		timex = realtime;
		return realtime;
		
	}
	
	

}
