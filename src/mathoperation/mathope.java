package mathoperation;

public class mathope {

	public static void main(String[] args) {
		
		
		mathoperatio(10,10);
		mathope obj=new mathope();
				obj.univercityresult("sourabh",10,'A',75.77f);
		
	}

	
	
	public static void mathoperatio(int a,int b) {
	int sub=a-b;
	int mul=a*b;
	int add=a+b;
	int div=a/b;
	
	
	System.out.println("sustraction is "+sub);
	System.out.println("multification is "+mul);
	System.out.println("addition is "+add);
	System.out.println("dividation is "+div);
}
	
	
	public void univercityresult(String studentname,int rollnum,char grade,float percentage) 
	{
		System.out.println("========================");
		System.out.println("student name is "+studentname);
		System.out.println("rollnum is "+rollnum);
		System.out.println("grade is "+grade);
		System.out.println("percentage is "+percentage);
		
		
		
}
	}