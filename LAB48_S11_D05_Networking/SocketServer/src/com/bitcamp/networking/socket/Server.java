package com.bitcamp.networking.socket;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
	// port boje od 0  do 65000 ( najbolje je da koristimo preko 1500)
	public static final int port = 1728;
	
	public static void startServer(){
		try {
			ServerSocket server = new ServerSocket(port); // ovaj Socket samo prima port
			                                              // drugi client Socket prima adresu i port
			
			while(true){ // koristimo true da bi nam socket uvijek radio
				System.out.println("waiting");
				server.accept() 
				//Accept vraca new Socket
				// kod dalje ne  raditi  dok se ne uspostavi konekcija
				System.out.println("Done connection!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		startServer();
	}

}
