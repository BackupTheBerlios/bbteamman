import java.awt.event.*;
import javax.swing.*;
/*
 * Created on 26.01.2004
 */
/**
 * @author jenshartjenstein
 */
public class Menu extends JMenuBar
{
	JMenu file, debug;
	
	public Menu(ActionListener e)
	{
		file = new JMenu("File");
		{
			JMenuItem mi = new JMenuItem("New Team");
			mi.setActionCommand("app.new");
			mi.setMnemonic('N');
			mi.addActionListener(e);
			mi.setAccelerator(KeyStroke.getKeyStroke('N'));
			file.add(mi);
			
			mi = new JMenuItem("Load Team");
			mi.setActionCommand("app.load");
			//mi.setMnemonic('N');
			mi.addActionListener(e);
			//mi.setAccelerator(KeyStroke.getKeyStroke('N'));
			file.add(mi);
			
			mi = new JMenuItem("Preferences");
			mi.setActionCommand("app.preferences");
			//mi.setMnemonic('N');
			mi.addActionListener(e);
			//mi.setAccelerator(KeyStroke.getKeyStroke('N'));
			file.add(mi);

			mi = new JMenuItem("Close");
			mi.setActionCommand("app.close");
			//mi.setMnemonic('N');
			mi.addActionListener(e);
			//mi.setAccelerator(KeyStroke.getKeyStroke('N'));
			file.add(mi);
		}
		this.add(file);
		debug = new JMenu("Debug");
		{
			debug.setMnemonic('D');
			JMenuItem mi;
			for (int i = 0; i < 2; i++)
			{
				mi = new JMenuItem("Item " + i);
				mi.setActionCommand("debug_" + i);
				//mi.setMnemonic('S');
				mi.addActionListener(e);
				debug.add(mi);
			}
		}
		this.add(debug);
	}
}
