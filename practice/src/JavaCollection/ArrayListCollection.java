package JavaCollection;

import java.util.ArrayList;
import java.util.List;
public class ArrayListCollection {

	public static void main(String[] args) {
		ArrayList<String> NameList=new ArrayList<String>();
		NameList.add("Sarvesh");
		NameList.add("Saurabh");
		NameList.add("Shomesh");
		System.out.println("names are : "+NameList);
		NameList.add(2,"raju");
		System.out.println("names are : "+NameList);
		ArrayList<String> names=new ArrayList(NameList.subList(1,3));
		System.out.println("sublist is "+names);
		List<String> list=NameList.subList(1,3);
		System.out.println("list is : "+list);
	}
}
