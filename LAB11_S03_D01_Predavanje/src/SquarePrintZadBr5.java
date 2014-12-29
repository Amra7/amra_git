public class SquarePrintZadBr5 {

	public static void main(String[] args) {
		
		System.out.println("unesi brojeve");
		
		
		int a = TextIO.getlnInt();
		int b = TextIO.getlnInt();
		System.out.println(pripremiPravouganonik(a, b));
		
		
	}
	
	public static String pripremiPravouganonik(int visina, int sirina) {

		String str = "";
		str = pripremiPrviIliZadnjiRed(sirina) + "\n";

		for (int i = 2; i < visina; i++) {
			str += pripremiSrednjiRed(sirina) + "\n";

		}
		str += pripremiPrviIliZadnjiRed(sirina);

		return str;
		
	}

	private static String pripremiProizvoljanRed(int sirina, char c, char d) {
		String str = "";
		str += c;
        for ( int i = 2; i < sirina; i++){
        	str += d;
        }
	    str += c;
		return str;
	}

	private static String pripremiSrednjiRed(int sirina) {
		String str = "";
		str = pripremiProizvoljanRed(sirina, '|', ' ');
		return str;
	}

	private static String pripremiPrviIliZadnjiRed(int sirina) {
		String str = "";
		str = pripremiProizvoljanRed(sirina, '+', '-');
		return str;
	}
	
	

}
