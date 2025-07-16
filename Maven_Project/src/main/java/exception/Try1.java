package exception;

public class Try1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
	try{
		int a=9/0;
		System.out.println(a);
	}
	catch (NullPointerException ex)
	{
		System.out.println("Nullpointer Exception handled");
	}
	catch (Exception e)
	{
		System.out.println("Arithmetic Exception handled");
	}
		finally
		{
		System.out.println("Finally block is executed");	
		}
		
	}

}
