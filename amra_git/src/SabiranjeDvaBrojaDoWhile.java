
public class SabiranjeDvaBrojaDoWhile {
public static void main(String[] args) {
	
	int suma, prvi, drugi;
	
	do {
		System.out.println("Unesi prvi broj");
		 prvi = TextIO.getInt();
		System.out.println("Unesi drugi broj");
		 drugi = TextIO.getInt();
		
		
		suma = prvi + drugi;
		System.out.printf("Suma je %d",suma);
	} while ((prvi!= 0) || (drugi != 0));
	
	
}
}
