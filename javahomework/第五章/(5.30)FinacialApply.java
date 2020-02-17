import java.util.Scanner;
class FinacialApply{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//每月支付额
		System.out.print("请输入每月在储蓄账户上存储的金额");
		double monthlyPay = sc.nextDouble();
		
		//年利率
		System.out.print("请输入年利");
		double rate = sc.nextDouble();
		
		//输入月份
		System.out.print("请输入月份数");
		int month = sc.nextInt();
		
		//月利加一
		final double totalRate = (1 + (rate / 12));
		//账户总金额
		double sum = 0;
		
		for(int i = 0; i <month; ++i){
			sum = (sum + monthlyPay) * totalRate;
		}
		System.out.printf("%d个月之后，最后账户的总额度为：%.3f", month, sum);
	}
}