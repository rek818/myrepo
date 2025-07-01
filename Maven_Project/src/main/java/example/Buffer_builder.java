package example;

public class Buffer_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer a= new StringBuffer("hello");
System.out.println(a);
StringBuilder b=new StringBuilder("world!");
System.out.println(b);

//insert - to insert new element to an index.

System.out.println(a.insert(5, "!"));
System.out.println(a);

//append-to add new string at the end of the string

System.out.println(a.append(b));

//replace-replace a value at the index position


//reverse

System.out.println(a.reverse());

//delete

System.out.println(a.delete(0,1));

System.out.println(a.replace(0, 6, "o"));


	}

}
