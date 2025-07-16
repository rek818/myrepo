package polymorphism;

public class OverrideChild extends OverrideParent{
	public void display()
	{
		super.display();
		System.out.println("Child class method display");
	}

	@Override
	public void show(String msg) {
		// TODO Auto-generated method stub
		super.show("Parent class method");
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OverrideChild obj=new OverrideChild();
obj.display();
obj.show("Child class second method");

	}

}
