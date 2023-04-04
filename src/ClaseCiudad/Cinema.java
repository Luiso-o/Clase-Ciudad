package ClaseCiudad;

public class Cinema extends Edificio{

	private int aforo;
	
	public Cinema(String nombre, int plantas, int superficie, int aforo) {
		super(nombre, plantas, superficie);
		this.aforo = aforo;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	public String proyectarSesion(int asistencia, int entrada) {
		
		int control=controlaAforo(asistencia);
		
			int recaudacion=control*entrada;
			
				return "Se han recaudado " + recaudacion + " euros en esta sesion.\n";
		
	}
	
	public int controlaAforo(int asistencia) {
		
		if(asistencia>aforo) {
			
			System.out.println("La asistencia para esta sesion supera el aforo permitido,\n"
					+ "entrar�n las " + aforo + " personas que han llegado primero.\n");
			
			asistencia=aforo;
			
		}
		
		return asistencia;
		
	}
	
	@Override
	public String toString() {			
		return "El Cinema " + super.toString() +"\ntiene un aforo de " + aforo + " personas por sesion.\n";
		
	}

	@Override
	public String calcularVigilancia() {
		int vigilantes=Math.round(superficie/3000);
		int costo=vigilantes*1300;
		
		return "Para este edificio necesitar�s " + vigilantes + " vigilantes,\n"
				+ "adem�s deber�s pagar " + costo + " euros mensuales en concepto de vigilancia.\n";
	}
	
}
