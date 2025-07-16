package access_modifiers;

public class Access1 {
	public void pubMethod()
	{
		System.out.println("This is a public method");
	}
private void privMethod()
{
	System.out.println("This is a private method");
}
protected void proMethod()
{
	System.out.println("This is a protected method");
}
void defmethod()
{
	System.out.println("This is a default method");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Access1 obj=new Access1();
obj.pubMethod();
obj.proMethod();
obj.privMethod();
obj.defmethod();
	}

}
