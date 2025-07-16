package abstraction;

public class Child2 extends Parent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent2 obj=new Child2();
		Child2 obj1=new Child2();
		obj.display();
		obj.show();
	//	obj.shows(); cannot access child class members using parent class object/reference
		obj1.shows();

	}
	public void shows()
	{
		System.out.println("Show child class method");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display method");
		
	}

}
