import javax.swing.*;

/*
 * Created on 14.06.2004
 */

/**
 * @author Hartjenstein
 */
public class Teamframe extends JInternalFrame {
	public Teamframe(Team team) {
		super(team.getTeamname(),true,true,true,true);
		this.setBounds(5,5,300,200);
		this.getContentPane().setLayout(null);
		JLabel temp = new JLabel(team.getTeamname());
		temp.setBounds(2,2,50,50);
		this.getContentPane().add(temp);
		this.show();
		
	}

}
