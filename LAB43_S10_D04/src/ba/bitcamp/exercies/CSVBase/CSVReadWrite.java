package ba.bitcamp.exercies.CSVBase;

public class CSVReadWrite {

	private static String basePath = "./DataBase/";
	
	public CSVReadWrite() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean saveToFile(String fileName,String  data){
		System.out.println("save file");
		try {
			System.out.println(data);
			TextIO.writeFile(basePath + fileName + ".csv");
			
			TextIO.putln(data);
		} catch (Exception e) {
			e.printStackTrace();
			return false;			
		}
        return true;
	}

}
