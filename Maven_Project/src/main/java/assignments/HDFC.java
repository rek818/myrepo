package assignments;

public class HDFC implements IRBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IRBI rbi=new HDFC();
		rbi.recurringDeposit(10000, 3);

	}

	@Override
	public void recurringDeposit(long amount, int duration) {
		// TODO Auto-generated method stub
		double rate=interestRate/100;
		double maturityAmount=amount*Math.pow(1+rate, duration);
		System.out.println(maturityAmount);
	}

}
