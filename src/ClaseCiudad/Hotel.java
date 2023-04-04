
package ClaseCiudad;

public class Hotel extends Edificio {
	
	private int habitaciones;
	
	public Hotel(String nombre, int plantas, int superficie, int habitaciones) {
		
		super(nombre, plantas, superficie);
		this.habitaciones = habitaciones;
		
	}
	
	public int getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public String servicioHabitacion() {
		
		int trabajadores=Math.round(habitaciones/20);
		float salario=trabajadores*1000;
		
		return "este hotel necesitar� " + trabajadores + " trabajadores para el "
				+ " servicio de habitaciones\ny se tendr� que pagar " + salario + 
				" euros mensuales" + " correspondientes a servicio de habitacion.\n";
		
	}

	@Override
	public String toString() {
		return "El Hotel " + super.toString() + "\ntiene " + habitaciones + " habitaciones, "
				+ servicioHabitacion();
	}

	@Override
	public String calcularVigilancia() {
		
		final int plusPeligrosidad=500;
		double vigilantes=Math.ceil((double)superficie/1000);
		double costo=vigilantes*(1300+plusPeligrosidad);
		
		return "Para este edificio necesitar�s " + vigilantes + " vigilantes,\n"
				+ "adem�s deber�s pagar " + costo + " euros mensuales en concepto de vigilancia.\n";
	}

	
	
}
