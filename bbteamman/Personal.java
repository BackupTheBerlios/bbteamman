/*
 * Created on 14.06.2004
 */

/**
 * @author Hartjenstein
 */
public class Personal {
	/**
	 * @param temp
	 */
	public Personal(String personaldata) {
		String[] a = personaldata.split("\t");
		type=a[0];
		maxnumber=Integer.parseInt(a[1]);
		cost=Integer.parseInt(a[2]);
	}
	String name;
	String type;
	int cost, maxnumber;
	
}
