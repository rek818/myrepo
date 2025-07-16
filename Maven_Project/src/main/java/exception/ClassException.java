package exception;

public class ClassException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
int num=4/0;
System.out.println(num);
String s=null;
System.out.println(s.length());
		}
		catch(ArithmeticException e){
			System.out.println("Exception handled");
			
		}
		
		finally
		{
			System.out.println("Exit code");
		}
//		 java.lang.ArrayIndexOutOfBoundsException:
////		
//		int a[]= {2,4,5,6};
//		for(int i=0;i<=4;i++)
//		System.out.println(a[i]);
		//nullpointer exception
		
//		String s=null;
//		System.out.println(s.length());
		
	}

}
