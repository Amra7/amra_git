import java.util.Scanner;


public class ZadatakBr6 {
public static void main(String[] args) {
	System.out.println("Please enter your first name than your last name separate by space?");
	Scanner unos = new Scanner(System.in);
	String nameSurname = unos.nextLine();
	String[] splitStr = nameSurname.split(" ");
	String name = splitStr[0];
	String surname = splitStr[1];
	
	input.substring(0, space);
	
	int firstNameLenght = name.length();
	int surnameLenght = name.length();
	
	System.out.printf("Your name is %d which has %d caracters",name, firstNameLenght);
	System.out.printf("Your surname is %d which has %d caracters",surname, surnameLenght);
	
	char inic1 = name.charAt(0);
	char inic2 = surname.charAt(0);
	
	System.out.printf("Your inicials are %d %d.",inic1, inic2);
	
	
	
}
}
