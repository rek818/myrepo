package abstraction;

public class ChildClass1 extends Parent1 {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Abstarct class implementation in child class");
	}
	public void show()
	{
		System.out.println("Show method");
	}
	public static void main(String args[])
	{
		ChildClass1 obj=new ChildClass1();
		obj.display();
		System.out.println(obj.sum(2, 10));
		obj.show();
		obj.read();
	}
	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		int sum=a+b;
		return sum;
	}

}
