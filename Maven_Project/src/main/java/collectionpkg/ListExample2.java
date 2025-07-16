package collectionpkg;

import java.util.ArrayList;
import java.util.Iterator;
//Arraylist
public class ListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String> a=new ArrayList<String>();
a.add("Book");
a.add("Pen");
a.add("Bottle");
a.add("Pencil");
System.out.println(a);

ArrayList<String> b=new ArrayList<String>();
b.add("Apple");
b.add("Orange");
b.add("Banana");
b.add("Kiwi");
System.out.println(b);

//addall=to combine two lists and store in a list
System.out.println(a.addAll(b));
System.out.println(a);

//containsall=to check a given list in present in another list
System.out.println(a.containsAll(b));
System.out.println(b.containsAll(a));


//isEmpty,clear,size,remove
//remove
System.out.println(a.remove(0));
System.out.println(a);

//iterator
Iterator i=a.iterator();

while(i.hasNext())
{
	System.out.println(i.next());
}
i.remove();
System.out.println(a);
	}

}
