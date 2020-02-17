import java.util.Scanner;
class FindMax{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//学生的个数
		int number;
		number = sc.nextInt();
		
		//用一个字符串数组和一个数组分别来存储学生的姓名和学生的成绩
		String[] name = new String[number];
		int[] grade = new int[number];
		
		for(int i = 0; i < number; ++i){
			name[i] = sc.next();
			grade[i] = sc.nextInt();
		}
		
		//找出最高的分和第二高的分
		int maxIndex = 0;
		int secondIndex = 0;
		//找最高分
		for(int x = 0; x < number; ++x){
			if(grade[x] > grade[maxIndex])
				maxIndex = x;
			else if(grade[x] > grade[secondIndex])
				secondIndex = x;
		}
		//找第二高分
		if(maxIndex == 0)
			++secondIndex;
		for(int x = 0; x < number; ++x){
			if(x == maxIndex)
				continue;
			else if(grade[x] > grade[secondIndex])
				secondIndex = x;
		}
		//输出结果
		System.out.println("获得最高分" + grade[maxIndex] + "的同学是：" + name[maxIndex]);
		System.out.println("获得第二高分" + grade[secondIndex] + "的同学是：" + name[secondIndex]);
	}
}