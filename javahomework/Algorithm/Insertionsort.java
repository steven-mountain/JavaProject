class Insertionsort{
	public static void main(String[] args){
		int[] number = new int[]{9,8,7,6,5,4,3,2,1};
		insertionsort(number, 2, 3);
		for(int x: number){
			System.out.println(x + " ");
		}
		
	}
	public static void insertionsort(int[] a, int left, int right){
		int j = 0; 
		int p = 0;
		int temp = 0;
		for(p = left + 1; p < right + 1; ++p){
			temp = a[p];
			for(j = p; j > left && a[j - 1] > temp; --j){
				a[j] = a[j - 1];
			}
			a[j] = temp;
		}
	}
}