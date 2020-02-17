package SropWatch9_6;

public class StopWatchTest {
	public static void main(String[] args){
		final int SIZE = 1000;
		int[] num = new int[SIZE];
		for(int i = 0; i < SIZE; ++i){
			num[i] = (int)(Math.random() * 100);
		}
		
		for(int x : num){
			System.out.print(x + " ");
		}
		System.out.println();
		StopWatch sw = new StopWatch();
		//System.out.println("Start tiem is:" + sw.getStartTime());
		//long start = new GregorianCalendar().getTimeInMillis();
		//System.out.println("The start time is: " + start);
		sw.start();
		for(int i = 0; i < SIZE - 1; ++i){
			for(int j = 0; j < SIZE - i - 1; ++j){
				if(num[j] > num[j +1]){
					num[j] = num[j] ^ num[j + 1];
					num[j + 1] = num[j + 1] ^ num[j];
					num[j] = num[j + 1] ^ num[j];
				}
			}
		}
		
		//System.out.println("Start time is :" + sw.getStartTime());
		//long stop = new GregorianCalendar().getTimeInMillis();
		//System.out.println("The end time is: " + stop);
		sw.stop();
		//System.out.println("end time is :" + sw.getendTime());
		long differ = sw.getElapsedTime();
		//long differ  = stop - start;
		System.out.println("The differ time is " + differ);
		for(int x : num){
			System.out.print(x + " ");
		}
	}
}
