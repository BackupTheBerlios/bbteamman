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
	private JDesktopPane desktop;
	public Gui() {
		super("BloodBowl Verwaltung");
		Teamdata.readTeamdata();
		this.setBounds(0,0,600,400);
		this.getContentPane().setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		button.setActionCommand("test");
		toolbar.add(button);
		this.getContentPane().add(toolbar,BorderLayout.NORTH);
		desktop = new JDesktopPane();
		desktop.setBounds(5,5,50,50);
		this.getContentPane().add(desktop,BorderLayout.CENTER);
		this.show();		
	}
	public void createTeamWindow(Team team) {
		desktop.add(new Teamframe(team));
	}
	public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			System.out.println(cmd);
			if (cmd.startsWith("app")) {
				if (cmd.equals("app.new")) {
					new NewTeamDialog_chooseRace(this);
				} else if (cmd.equals("app.preferences")) {
					new Preference_gui(this);
				} else if (cmd.equals("app.close")) {
					System.exit(1);
				} else if (cmd.equals("app.save")) {
					desktop.getSelectedFrame();
				} 
			}
			if (cmd.equals("test")) {
				//desktop.add(new Teamframe(new Team("test")));				
			} 
	}
}
