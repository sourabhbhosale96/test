package constructor;

public class CC1 {

	int a;
	int b;
	
	public CC1()
	{
		a=10;
		b=10;
	}
	
	public CC1(int x,int y)
	{
		a=x;
	    b=y;
	}
	
	public static void main(String[] args) {
		
		CC1 o1=new CC1();
		o1.test();
	    CC1 o2=new CC1(10,10);
	    o2.test();
		

	}
	public void test()
	{
		int sum=a+b;
		System.out.println("sum is "+sum);
	}

}
