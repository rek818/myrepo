package assignments;

 abstract class Employee {
	protected double paymentPerHour;
	Employee(double paymentPerHour){
		this.paymentPerHour=paymentPerHour;
	}
	public abstract double calculateSalary();
	
	

}
