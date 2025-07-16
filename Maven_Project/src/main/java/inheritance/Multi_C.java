package inheritance;

public class Multi_C extends Multi_B{
	public void write()
	{
		System.out.println("Class C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi_C obj=new Multi_C();
		Multi_A obj1=new Multi_A();
		Multi_B obj2=new Multi_B();
		obj1.display();
		obj2.show();
		obj2.display();
		obj.display();
		obj.show();
		obj.write();
		
			

	}

}
