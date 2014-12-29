import java.util.Scanner;


public class ZadatakBr4 {
public static void main(String[] args) {
	System.out.println("How many quarters you have?");
	Scanner unos = new Scanner (System.in);
	int quarter = unos.nextInt();
	
	System.out.println("How many dimes you have?" );
	Scanner unos1 = new Scanner (System.in);
	int dimes = unos1.nextInt();
	
	System.out.println("How many nicles you have?");
	Scanner unos2 = new Scanner (System.in);
	int nicle = unos2.nextInt();
	
	System.out.println("How many quarters you have?");
	Scanner unos3 = new Scanner (System.in);
	int penny = unos3.nextInt();
	
	double sum = (double)((4 * quarter) + (10 * dimes)  + (20 * nicle) + (100 * penny));
	double dollar = sum / 100.0;
	
	System.out.println("It is " + dollar + " dollars.");
	System.out.printf("It is %f dollars.", dollar);
	
	
}
}
