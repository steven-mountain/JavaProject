import java.util.Scanner;
class SolveString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//提示用户输入一个字符串
		System.out.print("Enter a String: ");
		String s;
		s = sc.nextLine();
		for(int i = 0; i < s.length();){
			System.out.print(s.charAt(i));
			i += 2;
		}
	}
}