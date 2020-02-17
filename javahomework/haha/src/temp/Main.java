package temp;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[][] rela;
	static boolean[] flag;
	static int numOfVetix;
	static int numOfEdg;
	final static int MAX = 100000;
	static StringBuilder sb = new StringBuilder();
	static int[] count;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		numOfVetix = sc.nextInt();
		numOfEdg = sc.nextInt();
		rela = new int[numOfVetix][numOfVetix];
		flag = new boolean[numOfVetix];
		count = new int[numOfVetix];
		for(int i = 0; i < numOfVetix; ++i){
			for(int j = 0; j < numOfVetix; ++j) {
				if(i == j)
					rela[i][i] = 0;
				else
					rela[i][j] = MAX;
			}
		}
		for(int i = 0; i < numOfEdg; ++i){
			int temp1 = sc.nextInt();
			int temp2 = sc.nextInt();
			int fare = sc.nextInt();
			rela[temp1 - 1][temp2 - 1] = fare;
			rela[temp2 - 1][temp1 - 1] = fare;
		}
		prim();
	}
	
	public static void prim(){
	    flag[0] = true;
	    for(int i = 0; i < numOfVetix; i++){
	    	count[i] = rela[i][0];
	    }
	    int sum = 0;
	    boolean fla = true;
	    for(int i = 1; i < numOfVetix; i++){
	        int u = -1,min = MAX;
	        for(int j = 1; j < numOfVetix; j++){
	            if(!flag[j] && count[j] < min){
	                u = j;
	                min = count[j]; 
	            }
	        }
	        if(u == -1){
	            fla = false;
	            break;
	        }
	        flag[u] = true;
	        sum += min;
	        for(int v = 0; v < numOfVetix; v++){
	            if(!flag[v] && count[v] > rela[u][v]){
	                count[v] = rela[u][v];
	            }
	        }
	    }
	    if(fla) 
	    	System.out.printf("%d",sum);
	    else 
	    	System.out.printf("-1");
	}
	public static void resetFlag(boolean[] flag) {
		for(int i = 0; i < flag.length; ++i) {
			flag[i] = false;
		}
	}
}

