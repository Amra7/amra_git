package PrviPackage;

public class ArrayUtil {
	/**
	 * Funkcija koja ispisuje niz elmenata koji su razdvojeni zarezom
	 * 
	 * @param arr
	 *            niz elemenata koji zelimo isprintati
	 */
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
	}

	/**
	 * Funkcija koja pomocu koje unosimo vrijednosti u niz
	 * 
	 * @param size
	 *            velicina niza oju mi odredjujemo
	 * @return vraca velicinu niza koju smo mi definisali sa vrijednosti koje mi
	 *         unosimo
	 */

	public static int[] getUserArray(int size) {

		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			System.out.println("Unesi elemente niza: ");
			newArray[i] = TextIO.getlnInt();
		}

		return newArray;
	}

	/**
	 * Funkcija koja svakom clanu niza zadane velicine pripisuje vrijednost koju
	 * mi odredjumeo
	 * 
	 * @param size
	 *            vrijedost koja oznacava velcinu niza
	 * @param defaultValue
	 *            je određena vrijednost koju sami definisemo
	 * @return vraca novi niz
	 */
	public static int[] getArray(int size, int defaultValue) {
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = defaultValue;
		}
		return newArray;
	}

	/**
	 * Funkcija koja prima dva niza, a prepisuje vrijednosti iy prvog niza u
	 * drugi
	 * 
	 * @param niz1
	 *            prvi niz elemenata
	 * @param niz2
	 *            drugi niz elemenata
	 * @return vraca drugi niz elemenata u koji smo prepisali vrijednosti iz
	 *         prvog niza elemenata
	 * @throws IllegalArgumentException
	 *             ako je prvi niz veci od drugog
	 */
	public static int[] copyArray(int[] array1, int[] array2) {
		// int [] newArray = new int [array1.length];

		if (array2.length < array1.length) {
			array2 = new int[array1.length]; // throw new
												// IllegalArgumentException
												// ("Ovaj program je nemoguce izvrsiti");

			// for ( int i =0; i < array1.length; i++){
			// newArray[i] = array1[i];
			// }
			// array2 = newArray;
			// } else {

			// }
			// return array2;
		}
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
		}
		return array2;
	}

	/**
	 * Funkcija koja pomjera desno vrijednosti niza
	 * @param array niz u kojem su smjestene vrijednosti
	 * @return vraca niz sa vrijednostima koje su za jedno mijesto pomjerene u desno
	 */
	public static int[] pomjeriDesno(int[] array) {

		for (int i = array.length - 2; i >= 0; i--) {
			array[i + 1] = array[i];
		}
		array[0] = 0;
		return array;
	}
/**
 * Funkcija koja pomjera lijevo vrijednosti niza
 * @param array niz u kojem su smjestene vrijednosti
 * @return vraca niz sa vrijednostima koje su za jedno mijesto pomjerene u lijevo
 */
	public static int[] pomjeriLijevo(int[] array) {

		for (int i = 1; i < array.length; i++) {
			array[i - 1] = array[i];
		}
		array[array.length - 1] = 0;
		return array;
	}
/**
 *  Funkcija pomocu koje unosim vrijednosti u matricu
 * @param size je velicina matrice koju mi unosimo
 * @return vraca matricu sa popunjenim vrijednostima koje proizvoljno unosimo
 */
	public static int[][] makingMatrix(int size) {
		int[][] matrix = new int[size][size];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Unesi vrijednosti u matricu: ");
				matrix[i][j] = TextIO.getlnInt();
			}
		}
		return matrix;
	}
/**
 * Funkcija koja printa matricu, dvodimenzionalni niz
 * @param matrix dvodimenzionalni niz 
 */
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf(" %2d ", matrix[i][j]);
			}
			System.out.println();
		}
	}
/**
 * Funkcija koja vraca niz velicina koji su velicine kolone matice
 * @param matrix dvodimenzionalni niz
 * @param numColumn broj kolone u matici
 * @return vraca niz vrijednosti odredjene kolone iz matrice
 */
	public static int[] arrayOfColumn(int[][] matrix, int numColumn) {
		int[] nizKolone = new int[matrix.length];
		int j = numColumn;
			for (int i = 0; i < matrix.length; i++) {
				nizKolone[i] = matrix[i][j];
			} 
		
		return nizKolone;

	}
	
	/**
	 * Funkcija koja pretrazuje vrijednost u nizu
	 * @param array niz vrijednosti
	 * @param key vrijednost koju trazimo
	 * @return ako pronadje trazenu vrijednost vraca njen index u nizu u protivnom vraca -1
	 */
	public static int linearSearch( int [] array, int key){
		 for ( int i =0; i< array.length; i++){
			 if ( array [i] == key){
				 System.out.println("Index na kojem se nalazi vrijednost je: "+i);
			 } 
		 }
		 return -1;
	}
	
	public static void sortArray (int [] array, boolean ascending){
		 ascending = true;
		 if (ascending){
			 sortAscending(array);
		 }else{
			 sortDescending(array);
		 }
		
		
	}

	private static void sortDescending(int[] array) {
		boolean swapped = true;
//	    int j=0;
	    int temp;
	    while (swapped){
	    	swapped = false;
//	    	j++;
	    	for ( int i = 0; i<array.length; i++){
	    		if ( array [i+1]> array [i]){
	    			temp = array [i];
	    			array [i] = array [i+1];
	    			array [i+1] = temp;
	    			swapped= true;
	    		}
	    	}
	    }
		
	}

	private static void sortAscending(int[] array) {
		boolean swapped = true;
//		int j = 0;
		int temp;
		while (swapped){
			swapped = false;
//			j++;
			for ( int i =0; i< array.length; i++){
				if ( array [i]> array [i+1]){
					temp = array [i];
					array [i]= array [i+1];
					array [i+1] = temp;
					swapped = true;
				}
			}
		}
		
	}

public static int [] 
}
