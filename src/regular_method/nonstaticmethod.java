package regular_method;

public class nonstaticmethod {

	public static void main(String[] args) {
		nonstaticmethod obj=new nonstaticmethod();
		obj.mymethod();
		
		anotherclass object=new anotherclass();
		
		object.sourabh();
	}
	
	public void mymethod()
	{System.out.println("hi this is mymethod");
}
}