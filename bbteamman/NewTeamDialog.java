import javax.swing.*;

/*
 * Created on 16.06.2004
 */

/**
 * @author Hartjenstein
 */
public class NewTeamDialog extends JDialog {
	/**
	 * @param parent
	 * @param selectedIndex
	 */
	public NewTeamDialog(Gui parent, int selectedIndex) {
		super(parent,"New Team",true);
		this.setSize(200,400);
		this.show();
	}	
}
