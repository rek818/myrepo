package assignments;

public class OffSeason extends OnSeason{
	
	@Override
	public void discount(double amount) {
		// TODO Auto-generated method stub
		
		double dis=0.15*amount;
		double finalamount=amount-dis;
		System.out.println("OffSeason discount price: "+finalamount);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnSeason obj2=new OnSeason();
		obj2.discount(2000);
OffSeason obj=new OffSeason();
obj.discount(2000);

	}

}
