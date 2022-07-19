
public class constructor {
     
	String name="sourabh";
	int rollno=20;
	char grade='A';
	
	public constructor() {
		
	}
	
	
	public constructor (String name1,int rollnoo,char gradee)
	{name=name1;
	rollno=rollnoo;
		grade=gradee;
	}
	public static void main(String[] args) {
		
		constructor cc1=new constructor("savita",20,'A');
		 cc1.studentinfo();
		 
		constructor cc2=new constructor();
		cc2.studentinfo();
         
	}

	
	
	public void  studentinfo()
	{
		System.out.println("my name is "+name);
		System.out.println("my rollno is "+rollno);
		System.out.println("my grade is "+grade);
	}
}
