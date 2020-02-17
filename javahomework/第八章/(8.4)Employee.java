class Employee{
	public static void main(String[] args){
		double[][] range = new double[8][2];
		double temp = 0;
		double tempN = 0;
		int i = 0;
		int j = 0;
		double sum = 0;
		
		double[][] times = {
		{2, 4, 3, 4, 5, 8, 8},
		{7, 3, 4, 3, 3, 4, 4},
		{3, 3, 4, 3, 3, 2, 2},
		{9, 3, 4, 7, 3, 4, 1},
		{3, 5, 4, 3, 6, 3, 8},
		{3, 4, 4, 6, 3, 4, 4},
		{3, 7, 4, 8, 3, 8, 4},
		{6, 3, 5, 9, 2, 7, 9}
		};
		
		for(i = 0; i < times.length; ++i){
			sum = 0;
			for(j = 0; j < times[i].length; ++j){
				sum += times[i][j];
			}
			range[i][0] = i;
			range[i][1] = (sum / 7);
		}
		
		for(i = 1; i < range.length; ++i){
			temp = range[i][1];
			tempN = range[i][0];
			for(j = i; j > 0 && range[j - 1][1] > temp; --j){
				range[j][1] = range[j - 1][1];
				range[j][0] = range[j - 1][0];
			}
			range[j][1] = temp;
			range[j][0] = tempN;
		}
		
		for(i = 0; i < range.length; ++i){
			System.out.println("Employee " + (int)range[i][0] + "'s avage work time is " + range[i][1]);
		}
	}
}