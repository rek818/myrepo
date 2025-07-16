package assignments;

public class ChildEncaps  extends ParentEncaps{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentEncaps obj=new ParentEncaps();
		obj.setPins(1212);
		if (obj.isValidPin())
		System.out.println("Valid pin"+"\n"+obj.getPins());
		else
			System.out.println("Not a valid pin");

	}

}
