package LargeNum.src.LargeNumber;

import java.math.BigDecimal;
import java.util.Arrays;

public class LargeNumber {
	String content;

	public LargeNumber(String content) {
		super();
		this.content = content;
	}
	
	//乘法
	public LargeNumber multiply(LargeNumber lu) {
		char[] ch1 = this.content.toCharArray();
		int[] x = new int[content.length()];
		int xlen = content.length();
		for(int i = 0; i < content.length(); ++i){
			x[i] = Integer.parseInt(String.valueOf(ch1[i]));
		}
		
		char[] ch2 = lu.content.toCharArray();
		int[] y = new int[content.length()];
		int ylen = lu.content.length();
		for(int i = 0; i < content.length(); ++i){
			y[i] = Integer.parseInt(String.valueOf(ch2[i]));
		}
		int[] z = new int[xlen + ylen];
		//----------------------------------------------------
		
        int xstart = xlen - 1;
        int ystart = ylen - 1;
        if (z == null || z.length < (xlen+ ylen))
            z = new int[xlen+ylen];
        
        long carry = 0;
        for (int j=ystart, k=ystart+1+xstart; j>=0; j--, k--) {
            long product = (y[j] & 0xffffffffL) *
                           (x[xstart] & 0xffffffffL) + carry;
            z[k] = (int)product;
            carry = product >>> 32;
        }
        z[xstart] = (int)carry;
        for (int i = xstart-1; i >= 0; i--) {
            carry = 0;
            for (int j=ystart, k=ystart+1+i; j>=0; j--, k--) {
                long product = (y[j] & 0xffffffffL) * 
                               (x[i] & 0xffffffffL) + 
                               (z[k] & 0xffffffffL) + carry;
                z[k] = (int)product;
                carry = product >>> 32;
            }
            z[i] = (int)carry;
        }
        return new LargeNumber(Arrays.toString(z));
    }

	//加法
	@SuppressWarnings("unused")
	public LargeNumber add(LargeNumber lu) {
		
		char[] ch1 = this.content.toCharArray();
		int[] x = new int[content.length()];
		for(int i = 0; i < content.length(); ++i){
			x[i] = Integer.parseInt(String.valueOf(ch1[i]));
		}
		
		char[] ch2 = lu.content.toCharArray();
		int[] y = new int[content.length()];
		for(int i = 0; i < content.length(); ++i){
			y[i] = Integer.parseInt(String.valueOf(ch2[i]));
		}
		
		
		//--------------------------------
        // If x is shorter, swap the two arrays
        if (x.length < y.length) {
            int[] tmp = x;
            x = y;
            y = tmp;
        }
        int xIndex = x.length;
        int yIndex = y.length;
        int result[] = new int[xIndex];
        long sum = 0;
        // Add common parts of both numbers
        while(yIndex > 0) {
            sum = (x[--xIndex] & 0xffffffffL) + 
                  (y[--yIndex] & 0xffffffffL) + (sum >>> 32);
            result[xIndex] = (int)sum;
        }
        // Copy remainder of longer number while carry propagation is required
        boolean carry = (sum >>> 32 != 0);
        while (xIndex > 0 && carry)
            carry = ((result[--xIndex] = x[xIndex] + 1) == 0);
        // Copy remainder of longer number
        while (xIndex > 0)
            result[--xIndex] = x[xIndex];
        // Grow result if necessary
        if (carry) {
            int bigger[] = new int[result.length + 1];
            System.arraycopy(result, 0, bigger, 1, result.length);
            bigger[0] = 0x01;
            return new LargeNumber(Arrays.toString(bigger));
        }
        return new LargeNumber(Arrays.toString(result));
    }

	//减法
	public LargeNumber subtract(LargeNumber lu) {
		int[] big = new int[content.length() > lu.content.length() ? content.length() : lu.content.length()];
		int[] little = new int[content.length() < lu.content.length() ? content.length() : lu.content.length()];
		if(content.length() >= lu.content.length()){
			char[] ch1 = this.content.toCharArray();
			for(int i = 0; i < content.length(); ++i){
				big[i] = Integer.parseInt(String.valueOf(ch1[i]));
			}
			
			char[] ch2 = lu.content.toCharArray();
			for(int i = 0; i < content.length(); ++i){
				little[i] = Integer.parseInt(String.valueOf(ch2[i]));
			}
		}else{
			char[] ch1 = this.content.toCharArray();
			for(int i = 0; i < content.length(); ++i){
				little[i] = Integer.parseInt(String.valueOf(ch1[i]));
			}
			char[] ch2 = lu.content.toCharArray();
			for(int i = 0; i < content.length(); ++i){
				big[i] = Integer.parseInt(String.valueOf(ch2[i]));
			}
			
		}
		
        int bigIndex = big.length;
        int result[] = new int[bigIndex];
        int littleIndex = little.length;
        long difference = 0;
        // Subtract common parts of both numbers
        while(littleIndex > 0) {
            difference = (big[--bigIndex] & 0xffffffffL) - 
                         (little[--littleIndex] & 0xffffffffL) +
                         (difference >> 32);
            result[bigIndex] = (int)difference;
        }
        // Subtract remainder of longer number while borrow propagates
        boolean borrow = (difference >> 32 != 0);
        while (bigIndex > 0 && borrow)
            borrow = ((result[--bigIndex] = big[bigIndex] - 1) == -1);
        // Copy remainder of longer number
        while (bigIndex > 0)
            result[--bigIndex] = big[bigIndex];
        return new LargeNumber(Arrays.toString(result));
    }
	//除法
	public LargeNumber divide(LargeNumber lu){
		BigDecimal b1 = new BigDecimal(content);
		BigDecimal b2 = new BigDecimal(lu.content);
		return new LargeNumber(b1.divide(b2).toBigInteger().toString());
	}

	@Override
	public String toString() {
		return content;
	}
	
	
}