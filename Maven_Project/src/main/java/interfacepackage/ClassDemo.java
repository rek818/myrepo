package interfacepackage;

public class ClassDemo implements IDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassDemo obj=new ClassDemo();
		obj.show();//abstract method
		obj.display();
		obj.read();
		IDemo.write();

	}
public void display()
{
	System.out.println("display method");
}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show mthod");
		
	}

}
