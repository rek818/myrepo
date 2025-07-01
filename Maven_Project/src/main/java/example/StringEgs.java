package example;

public class StringEgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="HelloWorld";
String s1=new String("World");
String s2=("The output is  World");
String s3="java";
String s4="java";
String s5="Java";
String s6="Selenium";
String s7=new String("java");

System.out.println(s2);
System.out.println(s);
System.out.println(s1);

//length-to get length of string

System.out.println(s1.length());

//concat - add two strings

System.out.println(s.concat(s1));
System.out.println(s);


//contains-whether a word or character is present,returns true or false
System.out.println(s2.contains(s));

//equals=compares and checks if they are equal,compares reference

System.out.println(s3.equals(s4));
System.out.println(s3.equals(s5));
System.out.println(s3.equals(s6));

//equals ignore case

System.out.println(s4.equalsIgnoreCase(s5));

//== compares value

System.out.println(s4==s3);
System.out.println(s3.equals(s7));
System.out.println(s3==s7);

//valueof-converts any type to string,used for type conversion

int a=3;
String b="";
System.out.println(String.valueOf(a));

//isEmpty

System.out.println(s3.isEmpty());
System.out.println(b.isEmpty());

	}

}
