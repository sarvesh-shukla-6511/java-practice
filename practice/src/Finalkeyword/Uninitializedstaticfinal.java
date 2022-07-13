package Finalkeyword;

class Example{
	static final int Empid=9000;
	
	public void func() {
		System.out.println("employee id is "+Empid);
	}
}

public class Uninitializedstaticfinal {
 public static void main(String [] args) {
	 Example obj=new Example();
	 obj.func();
 }
}
