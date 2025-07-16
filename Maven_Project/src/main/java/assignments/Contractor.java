package assignments;

public class Contractor extends Employee {
	private double workingHours;


	Contractor(double workingHours, double paymentPerHour) {
		super(paymentPerHour);
		this.workingHours=workingHours;
		
	}
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return paymentPerHour*workingHours;
	}
	



	}

	

	
	


