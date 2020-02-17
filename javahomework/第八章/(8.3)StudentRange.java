class StudentRange{
	public static void main(String[] args){
		int[][] range = new int[8][2];
		int temp = 0;
		int tempN = 0;
		int i = 0;
		int j = 0;
		
		char[][] answers = {
		{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
		{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
		{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
		{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
		};
		
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		for(i = 0; i < answers.length; ++i){
			int correctCount = 0;
			for(j = 0; j < answers[i].length; ++j){
				if(answers[i][j] == keys[j])
				++correctCount;
			}
			range[i][0] = i;
			range[i][1] = correctCount;
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
			System.out.println("Student " + range[i][0] + "'s correct count is " + range[i][1]);
		}
	}
}