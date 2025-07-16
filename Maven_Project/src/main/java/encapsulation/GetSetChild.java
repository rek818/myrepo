package encapsulation;

public class GetSetChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GetSetParent obj=new GetSetParent();
obj.setSubject("Science");
System.out.println(obj.getSubject());
obj.setScore(60);
System.out.println(obj.getScore());
obj.setGrade('C');
System.out.println(obj.getGrade());
obj.setPercentage(60.00);
System.out.println(obj.getPercentage());
	}

}
