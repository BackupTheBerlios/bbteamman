import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
 * Created on 14.06.2004
 */

/**
 * @author Hartjenstein
 */
public class NewTeamDialog_chooseRace extends JDialog implements ActionListener {
	public JTextField money,minplayer;
	public JComboBox combo;
	private Gui parent;
  	public NewTeamDialog_chooseRace(Gui parent) {
  		super(parent,"Choose Team race",true);
  		this.parent=parent;
		this.setBounds(10,10,400,250);
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
		
		Object[] combotest = {"","test","test2"};
		combo = new JComboBox(combotest);
		combo.setBounds(45,5,150,20);
		this.getContentPane().add(combo);
		
		JButton cancel = new JButton("Cancel",new ImageIcon("D:/Programme/eclipse/workspace/bb verwaltung/help.gif"));
		cancel.addActionListener(this);
		cancel.setActionCommand("cancel");
		cancel.setSize(90,30);
		cancel.setLocation(this.getWidth()-cancel.getWidth()-15,this.getHeight()-cancel.getHeight()-35);
		this.getContentPane().add(cancel);
	
		JButton save = new JButton("Continue",new ImageIcon("D:/Programme/eclipse/workspace/bb verwaltung/help.gif"));
		save.addActionListener(this);
		save.setActionCommand("continue");
		save.setSize(90,30);
		save.setLocation(this.getWidth()-cancel.getWidth()-cancel.getWidth()-10,this.getHeight()-save.getHeight()-35);
		this.getContentPane().add(save);
		Object[][] data = {
				{"",new Integer(16),new Integer(40000),"Goblin", new Integer(6), new Integer(2), new Integer(3), new Integer(7),"Lebensm�de,Ausweichen,Kleinw�chsig"},
				{"Zauberer", "1", new Integer(150000), "", "", "", "", "", ""},
				{"Sani", "1", new Integer(50000), "", "", "", "", "", ""},
				{"Trainingsmarke", "8", new Integer(60000), "", "", "", "", "", ""}	
		};
		String[] columnNames = {"Description","#","Cost","Position","M","ST","AG","RW","Abillities"};
		JTable table = new JTable(data, columnNames);		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(25);		
		table.getColumnModel().getColumn(2).setPreferredWidth(50);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setPreferredWidth(25);
		table.getColumnModel().getColumn(5).setPreferredWidth(25);
		table.getColumnModel().getColumn(6).setPreferredWidth(25);
		table.getColumnModel().getColumn(7).setPreferredWidth(25);
		table.getColumnModel().getColumn(8).setPreferredWidth(200);
		JScrollPane scroll = new JScrollPane(table);		
		scroll.setLocation(5,30);
		scroll.setSize(this.getWidth()-20,this.getHeight()-save.getHeight()-35-35);		
		this.getContentPane().add(scroll);
		
		
  	}
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent arg0) {
		String cmd = arg0.getActionCommand();
		if (cmd.equals("continue")) {
			if (combo.getSelectedIndex()>0) {
				this.hide();
				new NewTeamDialog(parent,combo.getSelectedIndex());
				this.dispose();
			}
		} else if (cmd.equals("cancel")) {
			this.dispose();
		}
	}
}
