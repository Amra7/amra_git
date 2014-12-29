
public class GlavnicaKamataUkupnavrijednost {
  public static void main(String[] args) {
	int glavnica = 5000;
	double kamata = (Math.random()*16);
	double IznosKamate = (double) (glavnica * kamata);
	double UkupnaVrijednost = (double) IznosKamate + glavnica;
	System.out.println("Glavnica je "+ glavnica);
	System.out.println("Kamata je "+ kamata);
	System.out.println(" Ukupna vrijednost je "+ UkupnaVrijednost);
	
}
}
