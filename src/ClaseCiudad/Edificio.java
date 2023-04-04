package ClaseCiudad;

public abstract class Edificio {

	protected final String nombre;
	protected final int plantas;
	protected final int superficie;
	
	public Edificio(String nombre, int plantas, int superficie) {
		
		this.nombre = nombre;
		this.plantas = plantas;
		this.superficie = superficie;	
		
	}

	public String getNombre() {
		return nombre;
	}

	public int getPlantas() {
		return plantas;
	}

	public int getSuperficie() {
		return superficie;
	}	
	
	public String limpiar() {
	
		double porSuperficie=Math.ceil((double)superficie/5);
		double porPlanta=Math.ceil((double)plantas/2);
		double eurosMensuales=(porSuperficie+porPlanta)*30;
		double tiempodeLimpieza=Math.ceil((porSuperficie+porPlanta)/24);
		
		return "Este edificio necesita " + tiempodeLimpieza + " horas diarias de limpieza,\n"
				+ "adem�s deber�s pagar " + eurosMensuales + " euros mensuales en limpieza.\n";
	
	}
	
	public abstract String calcularVigilancia();
			
	@Override
	public String toString() {
		return nombre + " tiene " + plantas + " plantas y una superficie de " + superficie
				+ " metros cuadrados,";
	}
	
	
	
}
