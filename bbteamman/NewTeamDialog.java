import java.awt.event.*;
import javax.swing.*;

/*
 * Created on 16.06.2004
 */

/**
 * @author Hartjenstein
 */
public class NewTeamDialog extends JDialog implements ActionListener {
	JTextField teamname;
	JLabel leftgold;
	Gui parent;
	/**
	 * @param parent
	 * @param selectedIndex
	 */
	public NewTeamDialog(Gui parent, int selectedIndex) {
		super(parent,"New Team",true);
		this.parent=parent;
		this.setSize(400,500);
		this.setResizable(false);
		this.getContentPane().setLayout(null);
		addComponents();
		this.show();
	}

	private void addComponents() {
		JLabel temp;
		int spaceright = 10;		
		int spacetop =5;
		int spaceleft = 5;
	
		temp=new JLabel("Teamname:");
		temp.setBounds(spaceleft,spacetop,80,20);
		this.getContentPane().add(temp);
		
		teamname = new JTextField();
		teamname.setBounds(temp.getX()+temp.getWidth(),spacetop,140,20);
		this.getContentPane().add(teamname);
		
		leftgold = new JLabel();
		leftgold.setBorder(BorderFactory.createLoweredBevelBorder());
		leftgold.setSize(80,20);
		leftgold.setLocation(this.getWidth()-leftgold.getWidth()-spaceright,spacetop);
		this.getContentPane().add(leftgold);
		
		temp = new JLabel("Gold:");
		temp.setSize(30,20);
		temp.setLocation(this.getWidth()-leftgold.getWidth()-temp.getWidth()-spaceright,spacetop);
		this.getContentPane().add(temp);
		
		JPanel player = new JPanel();
		player.setBorder(BorderFactory.createTitledBorder("Player"));
		player.setBounds(spaceleft,teamname.getY()+teamname.getHeight()+spacetop+5,150,200);
		this.getContentPane().add(player);
		
		JPanel starplayer = new JPanel();
		starplayer.setBorder(BorderFactory.createTitledBorder("Starplayer"));
		starplayer.setSize(this.getWidth()-player.getX()-player.getWidth()-spaceright-10,200);
		starplayer.setLocation(this.getWidth()-starplayer.getWidth()-spaceright,teamname.getY()+teamname.getHeight()+spacetop+5);
		this.getContentPane().add(starplayer);
		
		JPanel team = new JPanel();
		team.setBorder(BorderFactory.createTitledBorder("Team"));
		team.setSize(player.getWidth(),50);
		team.setLocation(spaceleft,player.getY()+player.getHeight()+spacetop);
		this.getContentPane().add(team);
		
		JPanel personal = new JPanel();
		personal.setBorder(BorderFactory.createTitledBorder("Personal"));
		personal.setSize(player.getWidth(),100);
		personal.setLocation(spaceleft,team.getY()+team.getHeight()+spacetop);
		this.getContentPane().add(personal);
		
		JPanel moneyspend = new JPanel();
		moneyspend.setLayout(null);
		moneyspend.setBorder(BorderFactory.createTitledBorder("Money spend"));
		moneyspend.setSize(starplayer.getWidth(),team.getHeight()+personal.getHeight()+5);
		moneyspend.setLocation(starplayer.getX(),starplayer.getY()+starplayer.getHeight()+spacetop);
		JLabel spenddetail = new JLabel();
		spenddetail.setBounds(5,15,moneyspend.getWidth()-10,moneyspend.getHeight()-20);
		moneyspend.add(spenddetail);
		this.getContentPane().add(moneyspend);
		
		
		this.setSize(this.getWidth(),moneyspend.getY()+moneyspend.getHeight()+70);
				
		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(this);
		cancel.setActionCommand("cancel");
		cancel.setSize(80,30);
		cancel.setLocation(this.getWidth()-cancel.getWidth()-spaceright,this.getHeight()-cancel.getHeight()-30);
		this.getContentPane().add(cancel);
		JButton create = new JButton("Create");
		create.addActionListener(this);
		create.setActionCommand("create");
		create.setSize(80,30);
		create.setLocation(this.getWidth()-cancel.getWidth()-create.getWidth()-spaceright-5,this.getHeight()-create.getHeight()-30);
		this.getContentPane().add(create);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent arg0) {
		String cmd = arg0.getActionCommand();
		if (cmd.equals("create")) {
			if (teamname.getText().equals("")) {
				JOptionPane.showMessageDialog(this,"No Teamname entered");				
			} else {
				parent.createTeamWindow(new Team(teamname.getText()));
				this.dispose();
			}
		} else if (cmd.equals("cancel")) {
			this.dispose();
		}
	}	
}
