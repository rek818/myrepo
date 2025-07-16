package collectionpkg;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add=add elements to the collection
		List<String> l=new ArrayList<String>();
		List<String> li=new ArrayList<String>();
		l.add("Blue");
		l.add("Yellow");
		l.add("Pink");
		System.out.println(l);
		
		//set=to set an element to a particular index by replacing the existing element
		l.set(1, "Green");
		System.out.println(l);
		l.add("Green");
		System.out.println(l);
		//indexOf()=to return the index of given element,for duplicate elements it returns the first occurrence
		System.out.println(l.indexOf("Blue"));
		//lastindexof-to return the last occurrence of the given element
		System.out.println(l.lastIndexOf("Green"));
		//get
		System.out.println(l.get(0));
		//contains
		System.out.println(l.contains("Blue"));
		//isEmpty=to check if collection is empty or not
		System.out.println(l.isEmpty());
		System.out.println(li.isEmpty());
		//remove
		System.out.println(l.remove("Green"));
		System.out.println(l);
		l.remove(0);
		
		for(int i=0;i<l.size();i++)
			System.out.println(l.get(i));
		for(String c:l)
		{
			System.out.println(c);
		}
			
		
		
		
	}

}
