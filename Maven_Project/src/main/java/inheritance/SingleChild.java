package inheritance;

public class SingleChild extends SingleParent{
	public void show()
	{
		System.out.println("Show");
	}

	public static void main(String[] args) {
		SingleParent obj=new SingleParent();
		//obj.show() we cannot access child class members using parent class object
		obj.display();
		SingleChild obj2=new SingleChild();
		obj2.show();//we can access both child class and parent class members using child class objects
		obj2.display();
		
		// TODO Auto-generated method stub

	}

}
