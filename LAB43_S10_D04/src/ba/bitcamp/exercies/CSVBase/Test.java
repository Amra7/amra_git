package ba.bitcamp.exercies.CSVBase;

public class Test {

	public static void main(String[] args) {
		User u1 =new User("Amra","Pop",27,true);
/*		User u2 =new User("Jay","Z",27,true);
		User u3 =new User("Beyonce","B",27,true);
		User u4 =new User("Ursula","B",27,true); */
		CSVReadWrite.saveToFile("file", "file data");
		
		System.out.println(u1.toCSVString(","));
		
	}

}
