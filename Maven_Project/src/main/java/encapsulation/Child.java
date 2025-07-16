package encapsulation;

public class Child extends Parent{

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
Parent obj=new Parent();

obj.setId(1);
int a =obj.getId();
obj.setName("Rekha");
String s=obj.getName();
System.out.println(a+"\n"+s);


	}

}
