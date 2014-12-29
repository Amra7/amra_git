package PredavanjeVedad;

public class Prikaza {

	private int brojOciju;
	private int brojUdova;
	private String ime;
	
	public Prikaza( int b, int bu, String ime){
		brojOciju=b;
		brojUdova=bu;
		this.ime=ime;
	}
	
	public Prikaza (String ime){
		this(100,100, ime);
	}
	
	public void kreciSe(){
		System.out.println("Kreces se kao prikaza!");
	}
	
	public void prepadni(){
		System.out.println("Kako samo prepadas!");
	}
	
	public void prepadni(Object osoba){
		System.out.println("Prepadas!" + osoba);
	}
	
}
