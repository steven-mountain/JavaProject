package RandomTest9_4;
import java.util.Random;
public class RandomTest {
	public static void main(String[] args){
		Random r = new Random(100);
		int k = 0;
		for(int i = 0; i < 50; ++i){
			System.out.printf("%2d  ", r.nextInt(100));
			++k;
			if(k > 4){
				k = 0;
				System.out.println();
			}
		}
	}
}
