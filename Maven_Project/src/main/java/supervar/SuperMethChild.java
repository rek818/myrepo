package supervar;

public class SuperMethChild extends SuperMethParent {
	public void show()
	{
		this.read();
		super.display();
		super.parent();
		System.out.println(super.c);
		System.out.println("Child class method show"); 
		
		
	}
	public void read()
	{
		System.out.println("Child class second method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperMethChild obj=new SuperMethChild();
obj.show();

	}

}
