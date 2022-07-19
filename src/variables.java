
public class variables {
     int a=100;
     static int b=10;
	public static void main(String[] args) {
		
		variables obj=new variables();
		obj.add();
		int sub=1000-obj.a;
		System.out.println(sub);
	}
	public void add()
	{
		int add=a+b;
		System.out.println("add is "+add);
	}
	
}
