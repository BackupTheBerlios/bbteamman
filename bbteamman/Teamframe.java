import javax.swing.JInternalFrame;

/*
 * Created on 14.06.2004
 */

/**
 * @author Hartjenstein
 */
public class Teamframe extends JInternalFrame {
	public Teamframe(String teamname) {
		super(teamname,true,true,true,true);
		this.setBounds(5,5,100,100);
		this.show();
		
	}

}
