package ba.bitcamp.controller;

import ba.bitcamp.view.*;

public class ApplicationController {

	public static void home(){
		// prikaz home GUI-a
		ApplicationView.home();
		
	}
	
	public static void main(String[] args) {
		
		/* Povezivanje sa  bazom */
		Main.init();	
		home();
	}
}
