import java.util.Scanner;


public class ZadatakBr5 extends ZadatakBr4 {
public static void main(String[] args) {
	
	System.out.println("How many eggs she has?");
	Scanner unos = new Scanner (System.in);
	int N = unos.nextInt();
	
	int numEggs = N;
	int gross = N / 144;
	int dozzenEggs = N / 12;
	int leftOverEggs = N % 12;
	
	System.out.printf("Your number of egss is %d gross, %d dozen adn %d leftovers. ", gross,dozzenEggs, leftOverEggs);
	
}
}
