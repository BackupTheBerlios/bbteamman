import java.io.File;

/*
 * Created on 16.06.2004
 */

/**
 * @author Hartjenstein
 */
public class Teamdata {
	private static TeamInformation[] teams;
	public static void readTeamdata() {
		File dir = new File("./teams/");
		File[] files = dir.listFiles();
		teams = new TeamInformation[files.length];
		int y=0;
		for (int x=0;x<files.length;x++) {
			if (!files[x].getName().endsWith("CVS")) { 
				System.out.println(files[x]);
				teams[y] = new TeamInformation(files[x]);
				y++;
			}
		}
	}
	public static TeamInformation getTeam(int index) {
		if (teams.length>=index) {
			return teams[index];
		}
		return null;
	}
	public static String[] getTeamNames() {
		String[] teamnames = new String[teams.length];
		for (int x=0;x<teams.length;x++) {
			TeamInformation team = teams[x];
			if (team!=null)
				teamnames[x]=team.getTeamname();			
		}
		return teamnames;
	}
}
