package FindPrimer_10_18;

import java.math.BigInteger;

public class FindPrimer {
	public static void main(String[] args) {
        BigInteger bigNum = new BigInteger(Long.MAX_VALUE + "");
        BigInteger temp = bigNum.nextProbablePrime();;
        
       for(int i = 0; i < 5; ++i){
            System.out.println(temp.toString());
            temp = temp.nextProbablePrime();
        }
    }
}
