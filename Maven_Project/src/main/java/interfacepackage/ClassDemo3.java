package interfacepackage;

//multiple inheritance

public class ClassDemo3 implements IDemo,IDemo2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassDemo3 obj=new ClassDemo3();
		obj.show();
		obj.hello();

	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Multiple inherticace method of 2nd interface");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Multiple inheritance method of first interface");
		
	}

}
