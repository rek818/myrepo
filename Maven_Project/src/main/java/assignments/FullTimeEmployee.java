package assignments;

public class FullTimeEmployee extends Employee {
	
	FullTimeEmployee(double paymentPerHour)
	{
		super(paymentPerHour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Contractor(5,100);
		System.out.println("Contractor salary:"+obj.calculateSalary());
		Employee obj2=new FullTimeEmployee(100);
		System.out.println("Full time employee salary:"+obj2.calculateSalary());

	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return paymentPerHour*8;
	}

}
