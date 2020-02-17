package Exercise12_30;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise12_30 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File(args[0]));
		int[] num = new int['z' - 'A'];
		byte by;
		while((by = sc.nextByte()) != -1){
			++num[by - 'A'];
		}
		sc.close();
		for(int i = 0; i < num.length; ++i){
			System.out.printf("Number of %c's:%d ", i + 'A', num[i]);
		}
	}
}
