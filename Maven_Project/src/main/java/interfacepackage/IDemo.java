package interfacepackage;

public interface IDemo {
	
	public  void show();
	
	default void read()
	{
		System.out.println("Default method");
	}
	public static void write()
	{
		System.out.println("Static method");
	}

}
