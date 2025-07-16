package inheritance;

public class FourthClass extends ThirdClass{
	
public void salarySlip()
{
System.out.println("Basic pay: "+basic);
System.out.println("Deduction: "+deduction);
System.out.println("Bonus: "+bonus);
System.out.println("HRA :"+hra);
System.out.println("PF: "+pf);
System.out.println("Total Salary: "+total);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourthClass obj=new FourthClass();
		obj.basicPay();
		obj.hraCalculate();
		obj.pfCalculate();
		obj.totalSalary();
		obj.salarySlip();

	}

}
