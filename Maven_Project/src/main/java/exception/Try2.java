package exception;

public class Try2 {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		int age=7;
		if(age>=18) 
			System.out.println("Eligible for voting");
			else
				throw new AgeException("Not elgible");
		}

	}


