/*
 * Created on 14.06.2004
 */

/**
 * @author Hartjenstein
 */
public class Team {
	private String teamname;
	private Player[] teamlist;
	private Personal[] personallist;
	public Team(String teamname) {
		this.teamname=teamname;
	}
	public String getTeamname() {
		return teamname;
	}

}
