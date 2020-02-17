import java.util.Scanner;
public class Equals {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = sort(s);
		System.out.println("The sorted string is :" + s);
		
	}
	public static String sort(String s){
		String tem = "";
		char[] temp = new char[s.length()];
		char ch = '0';
		
		for(int i = 0; i < s.length(); ++i){
			temp[i] = s.charAt(i);
		}
		for(int i = 0; i < s.length() - 1; ++i){
			for(int j = 0; j < s.length() - i - 1; ++j){
				if(temp[j] > temp[j + 1]){
					ch = temp[j];
					temp[j] = temp[j + 1];
					temp[j + 1] = ch;
				}
			}
		}
		
		for(int i = 0; i < s.length(); ++i){
			tem += temp[i];
		}
		return tem;
	}
}
