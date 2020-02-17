import java.util.Scanner;
class RangeStudent{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int number = sc.nextInt();
		String[] s = new String[101];
		int x = 0;
		String temp = "";
		for(int i = 0; i < number; ++i){
			temp = sc.next();
			x = sc.nextInt();
			s[x] = (temp + " ");
		}
		
		for(int j = 100; j >= 0; --j){
			if(s[j] != null){
				System.out.println(s[j]);
			}
		}
	}
}