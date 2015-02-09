package ba.bitcamp.Benjo.pools;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import ba.bitcamp.logger.Logger;

public class TestGreetings {

	public static void main(String[] args) {
		
		/*
		 Greetings g1 = new Greetings("Jedan");
		 new Thread(g1).start();
		 
		 Greetings g2 = new Greetings("Dva");
		 new Thread(g2).start();
		 
		 Greetings g3 = new Greetings("Tri");
		 new Thread(g3).start();
		 
		 Greetings g4 = new Greetings("Cetiri");
		 new Thread(g4).start();
		 
		 Greetings g5 = new Greetings("Pet");
		 new Thread(g5).start();
		 */
		 
		 HashMap<String, String> logs =  new HashMap<String, String>();
		 logs.put("threadlog", "threadlog");
		 
		 try {
			new Logger(logs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		 int numThread = 5;

		 for (int i=0; i< numThread; i++){
		//	 new Thread(new Greetings(Integer.toString(i))).start();
		 }
		 
		 es.shutdown();
		 while (!es.isTerminated()){};
		 Logger.log("threadlog", "All done!");
		 
	}
}
