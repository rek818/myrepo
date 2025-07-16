package exception;

public class ThrowThrows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int age=4;
		if (age>18)
			System.out.println("Eligible for voting");
		else
			throw new Exception ("Not elgibile for voting");

	}

}
