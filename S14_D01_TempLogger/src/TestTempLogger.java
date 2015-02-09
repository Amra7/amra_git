import java.io.FileNotFoundException;
import java.util.HashMap;

import ba.bitcamp.logger.Logger;


public class TestTempLogger {

	public static void main(String[] args) {

		HashMap<String, String> logMap = new HashMap<String, String>();
		// application
		// warning
		// error

		logMap.put("application", "aplication");
		logMap.put("error", "error");
		logMap.put("warning", "warning");

		try {
			new Logger(logMap);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Logger.log("application", "application log");
		Logger.log("error", "error log");
		Logger.log("warning", "warning log");
	}

}
