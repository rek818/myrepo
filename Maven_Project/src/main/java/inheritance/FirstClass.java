package inheritance;

import java.util.Scanner;

public class FirstClass {
	double basic;
	double deduction;
			double bonus;
	
	public void basicPay()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic salary");
		basic=sc.nextDouble();
		System.out.println("Enter Deduction");
		deduction=sc.nextDouble();
		System.out.println("Enter bonus");
		bonus=sc.nextDouble();
		
		
		
	}


}
