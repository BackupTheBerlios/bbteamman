/*
 * Created on 14.06.2004
 */

/**
 * @author Hartjenstein
 */
public class Player {
	/**
	 * @param temp
	 */
	public Player(String playerdata) {
		String[] a = playerdata.split("\t");		
		maxnumber=Integer.parseInt(a[0]);
		cost=Integer.parseInt(a[1]);
		position=a[2];
		movement=Integer.parseInt(a[3]);
		strength=Integer.parseInt(a[4]);
		agility=Integer.parseInt(a[5]);
		armor=Integer.parseInt(a[6]);
		if (!a[7].equals("")) {
			abilities=a[7].split(",");
		}
	}
    int maxnumber;
    int cost;
    
	String name;
	int number;
	String position;
	
	int movement;
	int strength;
	int agility;
	int armor;
	
	int pass = 0;
	int touchdown = 0;
	int vsa = 0;
	int abgefangene = 0;
	int starplayerpoints = 0;
	
	String[] abilities;
}
