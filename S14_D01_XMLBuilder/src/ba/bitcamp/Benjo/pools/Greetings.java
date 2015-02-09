package ba.bitcamp.Benjo.pools;

import ba.bitcamp.logger.Logger;

public class Greetings implements Runnable{

	private String id;
	
	public Greetings(String id){
		this.id =id;
	}
	@Override
	public void run() {
		for ( int i=0; i<5; i++){
		//	System.out.printf("Ja sam thread: %s izbrojao sam %d \n", id ,i );
			String message =  String.format("Hi I am thread %2s , my count is %2d\n",id, i);
			
			if ( i>0 && i%3 ==0){
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			Logger.log("threadlog", message);
		}
		
	}

}
