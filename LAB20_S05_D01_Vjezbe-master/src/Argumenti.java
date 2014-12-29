public class Argumenti {
	public static void main(String[] args) {

		System.out.println("Unesi pet vrijednosti niza:");
		int[] niz = new int[5];

		System.out.println("Unesi prvu vrijednost: ");
		int broj1 = TextIO.getInt();
		niz[0] = broj1;
		System.out.println("Unesi drugu vrijednost: ");
		int broj2 = TextIO.getInt();
		niz[1] = broj2;
		System.out.println("Unesi trecu vrijednost: ");
		int broj3 = TextIO.getInt();
		niz[2] = broj3;
		System.out.println("Unesi cetvrtu vrijednost: ");
		int broj4 = TextIO.getInt();
		niz[3] = broj4;
		System.out.println("Unesi petu vrijednost: ");
		int broj5 = TextIO.getInt();
		niz[4] = broj5;

		if (args.length == 0) {
			najmanji(niz);
			najveci(niz);
			srednjaVrijednost(niz);
		}else if (args[0].equals("min")){
					najmanji(niz);
		}else if (args[0].equals("min")){
						najveci(niz);
		}else if(args[0].equals("min")){			
			srednjaVrijednost(niz);
		}
		
				
		
	}

	public static void najmanji(int[] niz) {
		int min = niz[0];
		for ( int i =1; i< niz.length; i++){
			if ( niz[i] <min){
				min = niz[i];
			}
		}
		System.out.println("Najmanje broj u nizu je: " + min);
	}
	
	public static void najveci ( int [] niz){
		int max = niz [0];
		for ( int i =1; i< niz.length; i++){
			if ( niz[i]> max){
				max = niz[i];
			}
		}
		System.out.println("Najveci broj u nizu je: "+ max);
	}
	
	public static void srednjaVrijednost (int [] niz){
		int suma = 0;
			for ( int i =0; i< niz.length; i++){
				suma+= niz[i];
			}
			int srednjaVrijednost = suma/niz.length;
			System.out.println("Sredna vrijednost niza: " + srednjaVrijednost);
	}
}
