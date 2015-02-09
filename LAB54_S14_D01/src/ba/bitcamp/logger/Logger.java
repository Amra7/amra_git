package ba.bitcamp.logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Class that creates logs and saves them into file.
 * @warning To use this class you have to create folder folder named "logs".
 * @author amrapoprzanovic
 *
 */
public class Logger {

	public static HashMap<String,FileOutputStream>logs = new HashMap<String,FileOutputStream>();
	//key - type of login
	//value - new FileoutputStream( new File od poslanog stringa)
	
	/**
	 * Constructor for Logger initials FileOutputStream for types of logins.
	 * In order to create logger you need to create HashMap<String ,FileOutputStream>
	 * @param logType - new HashMap that we create Key-String key = type of Login, Value - new FileoutputStream(new File() - of String we sent)
	 * @throws FileNotFoundException
	 */
	public Logger(HashMap<String,String> logType) throws FileNotFoundException{
		
		String basePath = "." +File.separator +"logs"+ File.separator;
		Set<String> keySeth = logType.keySet();
		Iterator<String> iter =  keySeth.iterator();
		
		while( iter.hasNext()){
			String key = iter.next();
			String value = logType.get(key);
			
			File newFile = new File(basePath + value + ".txt");
			FileOutputStream fos = new FileOutputStream(newFile, true); // append true so that new data written in file would not overwrite the old one.
			logs.put(key, fos);
			
		}
		
	}
	/**
	 * This method takes message, adds date on message and save it in file.
	 * User sends only message , but we send type.
	 * @warning if type is not initials log is not safe.
	 * @param type  - type of login.
	 * @param message - is message that we sent.
	 */
	public static void log(String type, String message){
		
		//ako nemamo posalni key "type" u mapi onda nemamo ni taj OutputStream.
		if (!logs.containsKey(type)){
			return ;
		}
		Date date = new Date();
		message = date.toString() + " " + message +"\n";
		
		FileOutputStream fos = logs.get(type);
		try {
			fos.write(message.getBytes());
			fos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
