package constructor;

public class studentinfo {

	String name;
	char Grade;
	
	public studentinfo()
	
	{
		name="nilesh";
		Grade='B';
	}
	public studentinfo(String name1,char grade1)
	{
	 name=name1;
	 Grade=grade1;
			 
	}
	public static void main(String[] args) {
		studentinfo o1=new studentinfo("sourabh",'A');
		o1.test();
		studentinfo o2=new studentinfo();
		o2.test();

	}
 public void test()
 {
	 System.out.println("My name is " +name);
	 System.out.println("my grade is"+Grade);
 }
}