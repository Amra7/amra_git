package PredavanjeVedad;

import java.awt.Color;

public class Vukodlak extends Prikaza {

	private Color bojaDlake;
	
	public Vukodlak( String ime, Color bojaDlake){
		super(ime);
		this.bojaDlake=bojaDlake;
	}
	
	public void zavijaj(){
		System.out.println("Auuuuu....!");
	}
	
	public void kreciSe(){
		System.out.println("Hodaj kao vukodlak!");
	}
	
	
}
