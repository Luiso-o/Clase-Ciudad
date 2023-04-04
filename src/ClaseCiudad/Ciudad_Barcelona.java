package ClaseCiudad;

import java.util.ArrayList;

public class Ciudad_Barcelona {

	public static void main(String[] args) {
		
		ArrayList<Edificio>lista=new ArrayList<Edificio>();
		
		Hospital hospital=new Hospital("Sant Pau", 8, 10000, 250);
		lista.add(hospital);
		
		Cinema cinema=new Cinema("Texas",1,8000,80);
		lista.add(cinema);
		
		Hotel hotel=new Hotel("Barcelona",10,50000,300);
		lista.add(hotel);
		
//		for(Edificio edificios : lista ){System.out.println(edificios);}
		
//-------------------------------------------------------------------------------------//		
		
		int menu=Metodos.pideInt("Que desea hacer?\n-------------->>"
			+ "\n1-Dar de alta un edificio.\n2-Mostrar un edificio.\n3-Eliminar un edificio.\n");
		
			switch(menu) {
			
			case 1:
				
				Metodos.nuevoEdificio(lista,Metodos.pideString("Introduce el nombre"));
			
					break;
					
			case 2:
				
				Metodos.mostrar(lista,Metodos.pideString("Introduce el nombre"));
				
				break;
				
			case 3:
				
				Metodos.eliminar(lista,Metodos.pideString("Introduce el nombre"));
				
			}
				
			System.out.println("\n<<Fin del programa>>");
				
//		for(Edificio edificios : lista ){System.out.println(edificios);}
				
	}//Main
		
}//APP
