import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/*
 * Created on 14.06.2004
 */

/**
 * @author Hartjenstein
 */
public class Gui extends JFrame implements ActionListener {
	public Gui() {
		super("BloodBowl Verwaltung");
		this.setBounds(0,0,600,400);
		this.getContentPane().setLayout(new BorderLayout());
		this.setJMenuBar(new Menu(this));
		JToolBar toolbar = new JToolBar();
		JButton button = new JButton();
		button.setActionCommand("app.new");
		ImageIcon a = new ImageIcon("D:/Programme/eclipse/workspace/bb verwaltung/help.gif");
		button.setIcon(a);
		button.addActionListener(this);
		toolbar.add(button);
		button = new JButton();
		button.addActionListener(this);
		button.setIcon(a);
		button.setActionCommand("app.preferences");
		toolbar.add(button);
		button = new JButton();
		button.addActionListener(this);
		button.setIcon(a);
		toolbar.add(button);
		this.getContentPane().add(toolbar,BorderLayout.NORTH);
		JDesktopPane desktop = new JDesktopPane();
		desktop.setBounds(5,5,50,50);
		this.getContentPane().add(desktop,BorderLayout.CENTER);
		this.show();
		
		desktop.add(new Teamframe("hallo"));
	}
	public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if (cmd.startsWith("app")) {
				if (cmd.equals("app.new")) {
					new NewTeamDialog(this);
				} else if (cmd.equals("app.preferences")) {
					new Preference_gui(this);
				} else if (cmd.equals("app.close")) {
					System.exit(1);
				}
			}
	}
}
