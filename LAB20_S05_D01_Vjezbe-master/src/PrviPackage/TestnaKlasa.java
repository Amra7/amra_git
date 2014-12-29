package PrviPackage;

public class TestnaKlasa {
    
	public static void main(String [] args){
    int [] arr1= {1,6,7,8,89,6};//ArrayUtil.getArray(5, -3);
    int [] arr2= ArrayUtil.getArray(3, 1);
    ArrayUtil.printArray(arr1);
    ArrayUtil.printArray(arr2);
      
    arr2 = ArrayUtil.copyArray(arr1, arr2);
	ArrayUtil.printArray(arr2);
	arr2 =ArrayUtil.pomjeriDesno(arr1);
	ArrayUtil.printArray(arr2);
	arr2 =ArrayUtil.pomjeriLijevo(arr1);
	ArrayUtil.printArray(arr2);
	
	System.out.println("Unesi velicniu matice: ");
	int size = TextIO.getlnInt();
	int [][] matrix = ArrayUtil.makingMatrix(size);
	ArrayUtil.printMatrix(matrix);
	
	System.out.println("Unesi broj kolone: ");
	int numColumn = TextIO.getlnInt();
	int [] nizKolone = ArrayUtil.arrayOfColumn(matrix, numColumn);
	ArrayUtil.printArray(nizKolone);
	 
	System.out.println("Unesite vrijednost koju pretrazujete: ");
	int key = TextIO.getlnInt();
	int index = ArrayUtil.linearSearch(arr1, key);
	System.out.printf("Broj na kojem se nalazi vrijednost je %d ", index);
	
	boolean ascending = true;
	ArrayUtil.sortArray(arr1, ascending);
	ArrayUtil.printArray(arr1);
	
	}
			
}
