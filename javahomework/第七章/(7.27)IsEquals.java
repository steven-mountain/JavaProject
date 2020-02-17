import java.util.Scanner;
public class IsEquals {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] temp = new int[100];
		int count = 0;
		for(int i = 0; ;++i){
			temp[i] = sc.nextInt();
			if(i == temp[0])
				break;
		}
		int[] list1 = new int[temp[0]];
		for(int j = 0; j < temp[0]; ++j){
			list1[j] = temp[j + 1];
		}
		
		for(int i = 0; ;++i){
			temp[i] = sc.nextInt();
			if(i == temp[0])
				break;
		}
		int[] list2 = new int[temp[0]];
		for(int j = 0; j < temp[0]; ++j){
			list2[j] = temp[j + 1];
		}
		list1 = sort(list1);
		list2 = sort(list2);
		if(equals(list1, list2))
			System.out.println("Two lists are  indentical");
		else
			System.out.println("Two lists are not  indentical");
	}
	public static boolean equals(int[] list1, int[] list2){
		if(list1.length != list2.length){
			return false;
		}
		else{
			for(int i = 0; i < list1.length; ++i){
				if(list1[i] != list2[i])
					return false;
			}
			return true;
		}
	}
	
	public static int[] sort(int[] list){
		int temp = 0;
		for(int i = 0; i < list.length - 1; ++i){
			for(int j = 0; j < list.length - i - 1; ++j){
				if(list[j] > list[j + 1]){
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
		return list;
	}
}
