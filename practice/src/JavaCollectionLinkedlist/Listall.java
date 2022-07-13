package JavaCollectionLinkedlist;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Listall {
	LinkedList<String> list = new LinkedList<String>();
	list.add("sarvesh");
	list.add("abhinav");
	list.add("hitesh");
	list.add("manvendra");
	list.add("bheem");
	list.add("ramesh");
	System.out.println(list);
	list.addFirst("Ram");
	list.add(3,"rita");//at 4th position
	list.removeFirst();
	list.removeLast();
	System.out.println(list);
	System.out.println("does the list contains sarvesh : "+list.contains("sarvesh"));
	System.out.println("index of hitesh is :  "+list.indexOf("hitesh"));
	list.remove(3);
	System.out.println(list);
	list.clear();//delete all the elements from linked list
	System.out.println("linked list elements are : "+list);
}
