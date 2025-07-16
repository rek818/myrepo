package access_modifiers;

public class Access2 extends Access1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access2 obj=new Access2();
		obj.proMethod();
		obj.proMethod();
		obj.defmethod();
		//obj.privMethod(); private method is not visible in child class,private method cannot override
	}

}
