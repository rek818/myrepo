package collectionpkg;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		
set.add("Green");
set.add("Red");
set.add("Blue");
set.add("Violet");
set.add("Pink");
System.out.println(set);

Set<String> set2=new HashSet<String>();

set2.add("Eyes");
set2.add("Ear");
set2.add("Tongue");
set2.add("Mouth");
set2.add("Skin");
set2.add("Ear");
System.out.println(set2);
System.out.println(set2.addAll(set));
System.out.println(set2);
System.out.println(set2.isEmpty());
set.clear();
System.out.println(set);
	}

}
