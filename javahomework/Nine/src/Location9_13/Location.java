package Location9_13;

public class Location {
	public int row;
	public int colum;
	public double maxValue;
	public static Location locateLargest(double[][] a) {
		Location l = new Location();
		l.maxValue = a[0][0];
		for(int i = 0; i < a.length; ++i) {
			for(int j = 0; j < a[i].length; ++j) {
				if(a[i][j] >  l.maxValue) {
					l.row = i;
					l.colum = j;
					l.maxValue = a[i][j];
				}
			}
		}
		return l;
	}

}
