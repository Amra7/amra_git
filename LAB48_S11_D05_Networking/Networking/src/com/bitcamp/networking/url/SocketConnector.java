package com.bitcamp.networking.url;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketConnector {

	public static final String serverAdress = "127.0.0.1"; //  mogli smo napisati i "local host" to znaci da se pokusavamo spojiti na isti racunar
	
	// port mora biti isti kao kod servere, ako nije isti onda se ne mogu spojiti
	public static final int port = 1728;
	
	private static void connectToServer() throws UnknownHostException, IOException{
		
		// klijentu Socket moramo predati i adresu i port
		Socket client = new Socket(serverAdress, port); 
		
		// kad se kilijent spoji onda on moze primati stream-ove i slatit, InputStream i OutputStream
		InputStream clientInt = client.getInputStream(); 
		OutputStream clientOut = client.getOutputStream();
	}
	
	
	
	public static void main(String[] args) {
		try {
			connectToServer();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
