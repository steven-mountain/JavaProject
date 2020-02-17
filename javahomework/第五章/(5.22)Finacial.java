import java.util.Scanner;

class Finacial{
	public static void main(String[] args){
		double interest, principal, balance;
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Loan Amount: ");
		double loanAmount = sc.nextDouble();
		
		System.out.print("number of years: ");
		int numberOfYears = sc.nextInt();
	
		System.out.print("Annual Interest Rate: ");
		
		double rate = sc.nextDouble() / 1200;
		
		double monthlyPayment = loanAmount * rate / (1 - 1/ Math.pow(1 + rate, numberOfYears * 12));
		System.out.println(monthlyPayment);
		principal = monthlyPayment;
		balance = loanAmount;
		double totalPayment = monthlyPayment * numberOfYears *12;
		
		System.out.println();
		System.out.println();
		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
		System.out.printf("Total Payment : %.2f\n", totalPayment);
		System.out.println();
		System.out.println();
		System.out.println("Payment#\tInterest\tPrincipal\tBalance");
		
		for(int i = 1; i <= numberOfYears * 12; ++i){
			System.out.print(i + "\t\t");
			interest = balance * rate;
			System.out.printf("%.2f\t\t",interest);
			System.out.printf("%.2f\t\t",principal - interest);
			balance -= (principal - interest);
			System.out.printf("%.2f\n", balance);
		}
        /*double totalPayment = monthlyPayment * numberOfYears *12;
		
        monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
        totalPayment =(int)(totalPayment * 100) / 100.0;
                
        String output = "The monthly payment is " + monthlyPayment +"\nThe total payment is " + totalPayment;
        JOptionPane.showMessageDialog(null,output);*/
	}
}