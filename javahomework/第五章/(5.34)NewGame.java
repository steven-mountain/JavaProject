import java.util.Scanner;
class NewGame{
	public static void main(String[] args){
		//创建输入对象
		Scanner sc = new Scanner(System.in);
		//创建用户输入
		int input;
		//计算机输入
		int computer;
		int user = 0;
		int comp = 0;
		while(true){
			//产生一个3以内的随机数
			computer = (int)(Math.random() * 3);
		
			//提示用户输入一个数范围在 0 - 3 
			//System.out.println(computer);
			System.out.print("sissor(0), rock(1), paper(2): ");
			input = sc.nextInt();
		
			switch(computer){
				case 0:
					if(input == 0){
						System.out.println("The computer is rock . You are rock too. It is a draw");
						break;
					}
					else if(input == 1){
						System.out.println("The computer is rock . You are scissor. Computer won");
						++comp;
						break;
					}
					else if(input == 2){
						System.out.println("The computer is rock . You are paper. You won");
						++user;
						break;
					}
				
				case 1:
					if(input == 0){
						System.out.println("The computer is scissor . You are rock. You won");
						++user;
						break;
					}
					else if(input == 1){
						System.out.println("The computer is scissor . You are scissor too. It is a draw");
						break;
					}
					else if(input == 2){
						System.out.println("The computer is scissor . You are paper. Computer won");
						++comp;
						break;
					}
				
				case 2:
					if(input == 0){
						System.out.println("The computer is paper . You are rock . Computer won");
						++comp;
						break;
					}
					else if(input == 1){
						System.out.println("The computer is paper . You are scissor. You won");
						++user;
						break;
					}
					else if(input == 2){
						System.out.println("The computer is paper . You are paper too. It is a draw");
						break;
				}
			}
			if(user == 2 || comp == 2)
				break;
		}
	}
}