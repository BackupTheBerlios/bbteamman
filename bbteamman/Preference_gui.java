import javax.swing.*;

/*
 * Created on 14.06.2004
 */

/**
 * @author Hartjenstein
 */
public class Preference_gui {
	public JTextField money,minplayer;
  	public Preference_gui(Gui parent) {
		JPanel panel = new JPanel();
		panel.add(new JLabel("Starting money:"));
		money = new JTextField();
		panel.add(money);
		panel.add(new JLabel("min Players:"));
		minplayer= new JTextField();
		panel.add(minplayer);
		JDialog dialog = new JDialog(parent, true);
		dialog.getContentPane().add(panel);
		dialog.show();
  }
}
