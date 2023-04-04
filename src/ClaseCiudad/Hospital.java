package ClaseCiudad;

public class Hospital extends Edificio{
	private int ingresados;
	
	public Hospital(String nombre, int plantas, int superficie, int ingresados) {
		super(nombre, plantas, superficie);
		this.ingresados = ingresados;
	}

	public int getIngresados() {
		return ingresados;
	}

	public void setIngresados(int ingresados) {
		this.ingresados = ingresados;
	}

	public int repartirComida() {
		
		final int comidas=3;
		
		int raciones=ingresados*comidas;
		
		return raciones;
		
	}

	@Override
	public String toString() {
		return "El Hospital " + super.toString() +"\nen estos momentos tiene " + ingresados 
				+ " Ingresados, por lo que se estan repartiendo "+ repartirComida() + " raciones diarias.\n";
	}

	@Override
	public String calcularVigilancia() {
		double vigilantes=Math.ceil((double)superficie/1000);
		double costo=vigilantes*1300;
		
		return "Para este edificio necesitar�s " + vigilantes + " vigilantes,\n"
				+ "adem�s deber�s pagar " + costo + " euros mensuales en concepto de vigilancia.\n";
		
	}

	
}//Class
