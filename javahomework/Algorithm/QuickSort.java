class QuickSort{
	public static void main(String[] args){
		int[] number = new int[]{9,8,7,6,5,4,3,2,1};
		//int temp = Meidan3(number, 0, number.length - 1);
		//System.out.println("temp = " + temp);
		quickSort(number, 0, number.length - 1);
		//swap(number, 0, number.length - 1);
		
		
		for(int x: number){
			System.out.println(x + " ");
		}
		
	}
	
	public static void quickSort(int[] A, int left, int right){
		int i = 0, j = 0;
		int Pivot = 0;
		if(left + 3 <= right){
			Pivot = Meidan3(A, left, right);
			i = left;
			j = right - 1;
			while(true){
				while(A[++i] < Pivot){}
				while(A[--j] > Pivot){}
				if(i < j){
					swap(A, i, j);
				}else{
					break;
				}
			}
			swap(A, i, right - 1);
			System.out.println("----------------------------");
			for(int x = left; x <= right; ++x){
				System.out.print(A[x] + " ");
			}
			System.out.println("\n-------------------------");
			System.out.println(left + " " + right);
			quickSort(A, left, i - 1);
			quickSort(A, i + 1, right);
		}else{
			insertionsort(A, left, right);
		}
	}
	
	public static int Meidan3(int[] A, int left, int right){
		int center = (left + right) / 2;
		if(A[left] > A[center])
			swap(A, left, center);
		if(A[left] > A[right])
			swap(A, left, right);
		if(A[center] > A[right])
			swap(A, center, right);
		swap(A, center, right - 1);
		return A[right - 1];
	}
	
	public static void insertionsort(int[] a, int left, int right){
		int j = 0; 
		int p = 0;
		int temp = 0;
		for(p = left + 1; p < right + 1; ++p){
			temp = a[p];
			for(j = p; j > 0 && a[j - 1] > temp; --j){
				a[j] = a[j - 1];
			}
			a[j] = temp;
		}
	}
	
	public static void swap(int[] A, int a, int b){
		int temp = 0;
		temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}
}