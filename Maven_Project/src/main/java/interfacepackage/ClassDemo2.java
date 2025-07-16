package interfacepackage;

public class ClassDemo2 implements IDemo2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassDemo2 obj=new ClassDemo2();
		obj.hello();
		//obj.hai() cannot access child class property

	}

	@Override
	public void hello() 
		// TODO Auto-generated method stub
		{
			System.out.println("Hello abstract method");
		}
		public void hai()
		{
			System.out.println("Child class method");
		}
	}


