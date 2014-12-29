package Benjo;

import javax.swing.JFrame;

public class SimpleGraphic extends JFrame{
	private int height;
	private int width;
	
	public SimpleGraphic(int height, int width){	
		setTitle("Nas prozorcic!");
		setSize(width, height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
		}
	
	
}
