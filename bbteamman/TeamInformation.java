import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 * Created on 16.06.2004
 */

/**
 * @author Hartjenstein
 */
public class TeamInformation {
	private String teamname;
	private Player[] player = new Player[6];
	Personal[] personal = new Personal[3];
	
	public TeamInformation(File file) {
		/*
		 * 1. Teamname
		 * 2. [Player]
		 * ... playerdate
		 * 3. [Personal]
		 * ... personaldata
		 * 4. [Other]
		 * ... otherdata
		 */
		if (file.exists()) {
			try {
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);			
				int i=0;
				int entry=0;
				for (int j = 0; j < 80; j++) {
					String temp = br.readLine();				
					if (temp!=null) {
						if (j==0) {
							teamname=temp;
						} else if (j>0) {
							if (temp.equals("[Player]") || temp.equals("[Personal]") || temp.equals("[Other]")) {
								i++;
								entry=0;
							} else {						
								if (i==1) {							
									Player blub= new Player(temp);
									player[entry]= blub;							
								} else if (i==2) {
									personal[entry]=new Personal(temp);
								} else if (i==3) {
								//	player[entry]=new Player(temp);
								}
								entry++;
							}
						}
					} else {
						break;
					}					
				}
				br.close();
	 			fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @return
	 */
	public String getTeamname() {
		return teamname;
	}
}
