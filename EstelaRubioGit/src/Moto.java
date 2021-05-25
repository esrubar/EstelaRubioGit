
public class Moto extends Vehiculo {
	private boolean llevoRadio;
	
	public Moto () {
		super (0,2);
		llevoRadio = false;
	}
	
	public void showInfo() {
		System.out.println("Soy un vheiculo");
	}
	
}
