package ba.bitcamp.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.AncestorListener;

public class ApplicationView extends Main {

	
	public static void home(){
		
		JPanel content = new JPanel();
		content.setSize(400, 500);
		JLabel greeting =  new JLabel("Welcome to BitBook");
		Font greeetingfont = new Font("SansSerif", Font.BOLD, 30);
		content.add(greeting);
		greeting.setFont(greeetingfont);
		
		JButton showContacts=  new JButton("Show Contacts");
		showContacts.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		JButton addContacts =  new JButton("Add Contacts");
		addContacts.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		content.add(showContacts);	
		content.add(addContacts);
		
		
		Main.replaceContent(content);
		Main.setVisible();
	}
	

}
