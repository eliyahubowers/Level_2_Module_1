package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	ArrayList<String> names = new ArrayList<String>();
	JFrame f;
	JPanel p;
	JButton b;
	JButton b2;
	public static void main(String[] args) {
		new GuestBook().buttons();
	}
	
	void buttons() {
		f = new JFrame();
		p = new JPanel();
		b = new JButton();
		b2 = new JButton();
		
		b.addActionListener(this);
		b2.addActionListener(this);
		b.setText("Add Name");
		b2.setText("View Names");
		
		p.add(b);
		p.add(b2);
		
		f.add(p);
		f.setVisible(true);
		f.pack();  
	}              

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			String s = JOptionPane.showInputDialog("put a name");
			names.add(s);
		}else if(e.getSource() == b2) {
			String s = "";
			int ii;
			 for(int i = 0; i < names.size(); i ++) {
				 ii = i+1;
				 s = s + "" 
				 		+ "Guest #" + ii + " : " + names.get(i) + "\n";
			 }				 
				JOptionPane.showMessageDialog(null,s);
		}
		
	}
}
