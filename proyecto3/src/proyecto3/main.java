package proyecto3;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		

			/* Instancia del Modelo */
			private proyecto pp;

			/**
			 * Crear la vista y el modelo del proyecto
			 * 
			 */
			

			public void printMenu() {

				System.out.println("\nBienvenido al administrador de proyectos github...");
				System.out.println("1. Crear Proyecto");
				System.out.println("2. Crear actividad");
				System.out.println("3. Añadir tarea");
				System.out.println("4. mostrar participantes");
				System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
			}

			public void run() {
				Scanner lector = new Scanner(System.in);
				boolean fin = false;
				String dato = "";
				Object respuesta = null;

				while (!fin) {
					printMenu();

					int option = lector.nextInt();
					switch (option) {
						case 1:
							System.out.println("Introducir nombre del proyecto");
							String nombre = lector.nextLine();
							System.out.println("Introducir descripción del proyecto");
							String descripcion = lector.nextLine();
							System.out.println("Introducir correo");
							String correo = lector.nextLine();
							System.out.println("Introducir nombre del creador");
							String duenio = lector.nextLine();
							proyecto pp = new proyecto(nombre, descripcion, nombre, correo);
							System.out.println("Proyecto creado correctamente");
							
							break;

						case 2:
							System.out.println("Introducir nombre de la actividad");
							String nombreacti = lector.nextLine();
							System.out.println("Introducir descripción de la actividad");
							String descripcionacti = lector.nextLine();
							Actividad acti = new Actividad(nombre, descripcion);
							pp.anadiractividad(acti);
							System.out.println("Actividad creada correctamente");
						

							break;
						case 3:
							System.out.println("Introducir Actividad asociada");
							String nombreactividadaso = lector.nextLine();
							 ArrayList<Actividad> actis = pp.getactividad();
							
							 for (Actividad i : actis) {
								 String status = i.getnombre();
								 if (status == nombreactividadaso) {
						
									   System.out.println("Introducir titulo de la tarea");
										String titulo = lector.nextLine();
										System.out.println("Introducir descripcion de la tarea");
										String descrip = lector.nextLine();
										System.out.println("Introducir tipo del proyecto");
										String tipo = lector.nextLine();
										System.out.println("Introducir tiempo esperado para la ejecucion de la tarea, en minutos");
										String tiempo = lector.nextLine();
										System.out.println("nombre delcreador");
										String nombrec = lector.nextLine();
										System.out.println("correo del creador");
										String correoc = lector.nextLine();
									 
								  // no pude hacer el casteo
									  i.anadirtarea(titulo, descrip, tipo, (int)tiempo, nombrec, correoc);
								 }
								 else {
									 System.out.println("no se encontro la actividad asociada");
									 break;
								 }
							 }


						case 4:
							System.out.println("Introducir Actividad asociada");
							String nombreactividadaso1 = lector.nextLine();
							 ArrayList<Actividad> actis1 = pp.getactividad();
							
							 for (Actividad i : actis1) {
								 String status = i.getnombre();
								 if (status == nombreactividadaso1) {
									 i.showparticipants();
								 }
								 }
							 
							
							break;
					

					

					}
			

		

	}

}
