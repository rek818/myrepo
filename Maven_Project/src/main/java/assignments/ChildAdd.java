package assignments;

public class ChildAdd extends Addition{
	public void check()
	{
		int sum=super.add(61, 14);
		if (sum%10==0)
			System.out.println("Divisible by 10");
		else
			System.out.println("Not divisible by 10");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAdd obj=new ChildAdd();
		obj.check();
		

	}

}
