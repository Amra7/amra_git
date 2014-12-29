
public class StringTest {
	public static void main(String[] args) {
	boolean tacno =  true;
	boolean netacno;
	netacno = false;
	String strTacno = String.valueOf(tacno);
	System.out.println(tacno);
	String test = new String("test");
	System.out.println(test);
	int LengthTest = test.length();
	System.out.println(LengthTest);
	String a = "Vedad";
	String b = "VEDAD";
	boolean eq = a.equals(b);
	System.out.println(eq);
	boolean c = a.equalsIgnoreCase(b);
	System.out.println(c);
	int comp = a.compareTo(b);
	System.out.println(comp);
	
	char compare = (char)"A".compareTo("B");
	System.out.println(compare);
	
	char prvi= a.charAt(0);
	System.out.println(prvi);
	int zadnji= (int) a.codePointAt(a.length() - 1);
	System.out.println(zadnji);
	
	int iPrvi = prvi;
	System.out.println(iPrvi);
	
	int index = a.indexOf("d", a.indexOf("d") +1);
	System.out.println(index);
	
	String unTrim = "   test  ";
	String trimedun = unTrim.trim();
	System.out.println(trimedun);
	
	System.out.println("Hello" + "World");
	
	
	
	
	
		
	}
}
