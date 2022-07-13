package Java8Programming;

interface Methodref{
	public void display();
}
public class Methodreference {
static void Saysomething() {
	System.out.println("this is static method");
}
public static void main(String args[]) {
	Methodref object = Methodreference :: Saysomething;
	object.display();
	
}
}
