public class ZadatakBr6PogadjanjeBrojeva {
	public static void main(String[] args) {
	
	int n = (int) (1+Math.random()*100);
	System.out.println("Unesi jedan broj izmedju 1 i 100: ");
	int broj = TextIO.getInt();
	int brojac = 0;
	
	while ( broj!=-1) {
		if (n == broj) {
			System.out.printf("Pogodio si broj %d", broj);
			System.out.printf("%nPogađali ste %d puta.", brojac);
			return;
		}
		
		if (n > broj){
			System.out.printf("Broj %d je manji od zamisljenog.\n", broj);
			brojac++;
			
		}
		if (n < broj){
			System.out.printf("Broj %d je veci od zamisljenog. \n", broj);
			brojac++;
			
		}
		
		System.out.println("Unesi novi broj: ");
		broj = TextIO.getInt();

	}
	
		
	}
	
}
	
	
	
