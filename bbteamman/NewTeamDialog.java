import java.awt.Dimension;

import javax.swing.*;

/*
 * Created on 14.06.2004
 */

/**
 * @author Hartjenstein
 */
public class NewTeamDialog extends JDialog {
	public JTextField money,minplayer;
  	public NewTeamDialog(Gui parent) {
  		super(parent,"New Team",true);
		this.setBounds(10,10,200,200);
		this.getContentPane().setLayout(null);
		this.setResizable(false);
		addComponents();
		
		this.show();
  	}
  	public void addComponents() {
		JLabel temp;
		temp = new JLabel("Rasse:");
		temp.setBounds(5,5,40,20);
		this.getContentPane().add(temp);
		
		JButton cancel = new JButton("Cancel",new ImageIcon("D:/Programme/eclipse/workspace/bb verwaltung/help.gif"));
		cancel.setSize(90,30);
		cancel.setLocation(this.getWidth()-cancel.getWidth()-15,this.getHeight()-cancel.getHeight()-35);
		this.getContentPane().add(cancel);
	
		JButton save = new JButton("Save",new ImageIcon("D:/Programme/eclipse/workspace/bb verwaltung/help.gif"));
		save.setSize(80,30);
		save.setLocation(this.getWidth()-cancel.getWidth()-cancel.getWidth()-10,this.getHeight()-save.getHeight()-35);
		this.getContentPane().add(save);
		Object[][] data = {
	{"Mary", "Campione",
	 "Snowboarding", new Integer(5), new Boolean(false)},
	{"Alison", "Huml",
	 "Rowing", new Integer(3), new Boolean(true)},
	{"Kathy", "Walrath",
	 "Knitting", new Integer(2), new Boolean(false)},
	{"Sharon", "Zakhour",
	 "Speed reading", new Integer(20), new Boolean(true)},
	{"Philip", "Milne",
	 "Pool", new Integer(10), new Boolean(false)}
};
		String[] columnNames = {"First Name",
						"Last Name",
						"Sport",
						"# of Years",
						"Vegetarian"};
		JTable table = new JTable(data, columnNames);
		JScrollPane scroll = new JScrollPane(table);
		table.setPreferredScrollableViewportSize(new Dimension(500, 70));
		scroll.setBounds(5,30,this.getWidth()-20,this.getHeight()-save.getHeight()-35-35);
		this.getContentPane().add(scroll);
		
		
  	}
}
