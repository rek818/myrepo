package aggregation;

public class AggreClass2 {
	String name;
	AggreClass1 ref;
	AggreClass2(String name,AggreClass1 ref)
	{
		this.name=name;
		this.ref=ref;
		System.out.println(name+"\n");
		System.out.println(ref.id+"\n"+ref.c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggreClass1 obj=new AggreClass1(1,'a');
		AggreClass2 obj2=new AggreClass2("Rekha",obj);

	}

}
