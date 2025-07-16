package aggregation;

public class Class2 {
	String gender;
	int age;
	Class1 ref;
	Class2(String gender,int age,Class1 ref)
	{
		this.gender=gender;
		this.age=age;
		this.ref=ref;
	}
	public void display()
	{
		
		System.out.println(gender+"\n"+age);
		System.out.println(ref.name+ref.marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 obj1=new Class1("Male",25);
		
		
Class2 obj=new Class2("Female",23,obj1);
obj.display();
	}

}
