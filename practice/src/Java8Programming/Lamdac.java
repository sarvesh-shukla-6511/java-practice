package Java8Programming;

import java.util.List;
import java.util.ArrayList;
public class Lamdac {
public static void main(String args[]) {
	List<String> list = new ArrayList<String>();
	list.add("Raj");
	list.add("Ram");
	list.add("Ramesh");
	list.add("rajesh");
	list.forEach((fruits) -> System.out.println(fruits));
	System.out.println("another way is --- ");
	for(String display:list) {
		System.out.println(display);
	}
}
}
