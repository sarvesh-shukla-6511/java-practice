package Java8Programming;

@FunctionalInterface
interface Greetings{
	public String say();
}
interface MyfunctionalInterface{
	public String sayHello();
}
public class java8 {
public static void main(String args[]) {
	Greetings object = ()->{
		return "good morning";
	};
	System.out.println(object.say());
   MyfunctionalInterface msg = () ->{
	   return "hello guys";
   };
   System.out.println(msg.sayHello());
}
}
