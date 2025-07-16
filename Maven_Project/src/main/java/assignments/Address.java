package assignments;

public class Address {
	Student ref;
	String address;
	Address(String address,Student ref)
	{
		this.address=address;
		this.ref=ref;
		System.out.println(address);
		System.out.println(ref.name+"\t"+ref.rollno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student("Rekha",3);
		Address obj1=new Address("ABC Street ,NP Nagar,Kolkata",obj);
		

	}

}
