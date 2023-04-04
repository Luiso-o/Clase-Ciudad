package ClaseCiudad;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {
	
	public static void nuevoEdificio(ArrayList<Edificio>lista,String nombre) {
		
		String tipoEdificio=Metodos.pideString("Que tipo de edificio desea dar de alta?");
		switch(tipoEdificio.toUpperCase()) {
		
			case "HOSPITAL":
				
			boolean encontrar=Metodos.buscarHospital(lista,nombre);
				
				if(!encontrar) {
					
					Hospital nuevo=new Hospital(nombre,Metodos.pideInt("Cuantas plantas tiene?"),
							Metodos.pideInt("Cual es su superficie?"),Metodos.pideInt("Cuantos pacientes hay ingrsados?"));
				
						lista.add(nuevo);
						
							System.out.println("Hemos agregado el Hospital " + nombre + " a la base de datos :)\n");
				}else {
						
					System.out.println("Ya existe un Hospital llamado " + nombre);
					
				}
				
				break;
				
			case "CINEMA":
				
				encontrar=Metodos.buscarCinema(lista,nombre);
				
				if(!encontrar) {
					
					Cinema nuevo=new Cinema(nombre,Metodos.pideInt("Cuantas plantas tiene?"),
							Metodos.pideInt("Cual es su superficie?"),
							Metodos.pideInt("Cual es el aforo maximo de este cinema?"));
				
						lista.add(nuevo);
						
							System.out.println("Hemos agregado el Cinema " + nombre + " a la base de datos :)\n");
							
				}else {
						
					System.out.println("Ya existe un Cinema llamado " + nombre);
					
				}
				
				break;
				
			case "HOTEL":
				
				encontrar=Metodos.buscarHotel(lista,nombre);
				
				if(!encontrar) {
					
					Hotel nuevo=new Hotel(nombre,Metodos.pideInt("Cuantas plantas tiene?"),
							Metodos.pideInt("Cual es su superficie?"),Metodos.pideInt("Cuantas habitaciones tiene?"));
				
						lista.add(nuevo);
						
							System.out.println("Hemos agregado el Hotel " + nombre + " a la base de datos :)\n");
							
				}else {
						
					System.out.println("Ya existe un Hotel llamado " + nombre);
					
				}
				
				break;		
		
		}//Switch
						
	}
	
	public static void mostrar(ArrayList<Edificio>lista,String nombre) {
		
		int indice=Metodos.verificar(lista,nombre);
		
		if(indice>-1) {
			
			System.out.println(lista.get(indice).toString());
			System.out.println(lista.get(indice).calcularVigilancia());
			System.out.println(lista.get(indice).limpiar());	
		
			if(lista.get(indice) instanceof Hospital) {}	
				
			else if(lista.get(indice) instanceof Cinema) {
				
				int asistencia=Metodos.pideInt("Cuantas personas han venido a ver la pelicula de esta sesion?");
				int entrada=Metodos.pideInt("Cual es el precio de entrada para la sesion de hoy?");
				
					System.out.println(((Cinema)lista.get(indice)).proyectarSesion(asistencia,entrada));
				
			}else if(lista.get(indice) instanceof Hotel) {}	
			
		}else {
			
			System.out.println("Este edificio no consta en la base de datos");
		}
	}
	
	public static void eliminar(ArrayList<Edificio>lista,String nombre) {
		
		int indice=Metodos.verificar(lista,nombre);
		
			if(indice==-1) {
				
				System.out.println("No existe un edificio con este nombre");
				
			}else {
				
				String tipoEdificio=Metodos.pideString("Que tipo de edificio es " + nombre +"?");
				
					switch(tipoEdificio.toUpperCase()) {
					
						case "HOSPITAL":
							
						boolean encontrar=Metodos.buscarHospital(lista,nombre);
							
							if(!encontrar) {
								
								System.out.println("No tenemos ningun Hospital llamado " + nombre);
								
							}else {
									
								lista.remove(indice);//tambien puedo eliminar un objeto
								
									System.out.println("El Hospital " + nombre + " a sido eliminado.\n");
								
							}
							
							break;
							
						case "CINEMA":
							
							encontrar=Metodos.buscarCinema(lista,nombre);
							
							if(!encontrar) {
								
								System.out.println("No tenemos ningun Cinema llamado " + nombre);
										
							}else {
									
								lista.remove(indice);
								
									System.out.println("El Cinema " + nombre + " a sido eliminado.\n");
								
							}
							
							break;
							
						case "HOTEL":
							
							encontrar=Metodos.buscarHotel(lista,nombre);
							
							if(!encontrar) {
								
								System.out.println("No tenemos ningun Hotel llamado " + nombre);
										
							}else {
									
								lista.remove(indice);
								
									System.out.println("El Hotel " + nombre + " a sido eliminado.\n");
								
							}
							
							break;		
					
					}//Switch
		
				}
			}
	
	public static int pideInt(String mensaje) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			System.out.println(mensaje);
				return input.nextInt();
	}
	
	public static String pideString(String mensaje) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			System.out.println(mensaje);
				return input.nextLine();
	}
	
	public static int verificar(ArrayList<Edificio>lista,String nombre) {
		
		int indice=-1;
		int contador=0;

		while(contador<lista.size() && indice==-1){

			if(lista.get(contador).getNombre().equalsIgnoreCase(nombre)){

				indice=contador;

			}

				contador++;

			}

					return indice;

		}
	
	public static boolean buscarHospital(ArrayList<Edificio>lista,String nombre) {
		
		Edificio edificio = null;
		int i = 0;
		boolean encontrado = false;
		
		while(!encontrado && i<lista.size()) {
			
			edificio=lista.get(i);
			
				if(edificio instanceof Hospital && edificio.getNombre().equalsIgnoreCase(nombre)) {
					
					edificio = lista.get(i);
					encontrado = true;
					
				}
			i++;
		}
		
		return encontrado;
	}
	
	public static boolean buscarCinema(ArrayList<Edificio>lista,String nombre) {
		
		Edificio edificio = null;
		int i = 0;
		boolean encontrado = false;
		
		while(!encontrado && i<lista.size()) {
			
			edificio=lista.get(i);
			
			if(edificio instanceof Cinema && edificio.getNombre().equalsIgnoreCase(nombre)) {
				
				edificio = lista.get(i);
				encontrado = true;
				
			}
			i++;
		}
		
		return encontrado;
	}
	
	public static boolean buscarHotel(ArrayList<Edificio>lista,String nombre) {
		
		Edificio edificio = null;
		int i = 0;
		boolean encontrado = false;
		
		while(!encontrado && i<lista.size()) {
			
			edificio=lista.get(i);
			
				if(edificio instanceof Hotel && edificio.getNombre().equalsIgnoreCase(nombre)) {
					
					edificio = lista.get(i);
					encontrado = true;
					
				}
				i++;
		}
		
		return encontrado;
	}

}
