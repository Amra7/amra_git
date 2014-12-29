
public class PrikljucenjeNaInternetZadBr10 {
public static void main(String[] args) {
	/**
	 * prva firma
	 */
	int fiksnaPredplata1 = 10;
	double placanjePoSatu1 = 0.5;
	
	int fiksnaPredplata2 = 0;
	double placanjePoSatu2 = 0.8;
	
	System.out.println("Unesi sate: ");
	int sati=TextIO.getInt();
	
	double prvaFirma= (fiksnaPredplata1 + sati*placanjePoSatu1);
	double drugaFirma =(fiksnaPredplata2 + sati *placanjePoSatu2);
	
	if (prvaFirma<drugaFirma) {
		
	}
}
}
