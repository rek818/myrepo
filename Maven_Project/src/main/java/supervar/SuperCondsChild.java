package supervar;

public class SuperCondsChild extends SuperConsParent{
public SuperCondsChild()
{
	super("parent class parameterized construcor");
	System.out.println("Non parameterized Child class constructor");
	
}
public SuperCondsChild(String m)
{
	this(3,6.0f);

	System.out.println(m);
}
public SuperCondsChild(int a,float b)
{
	float c=a+b;
	System.out.println(c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperCondsChild obj1=new SuperCondsChild();
		SuperCondsChild obj=new SuperCondsChild("Child class parameterized constructor");

	}

}
