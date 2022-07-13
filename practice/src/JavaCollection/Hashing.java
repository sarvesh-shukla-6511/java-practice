package JavaCollection;
import java.util.*;  
class Hashing{  
 public static void main(String args[]){  
	 TreeMap<Integer, String> tree_map
     = new TreeMap<Integer, String>();
 tree_map.put(10, "Geeks");
 tree_map.put(15, "4");
 tree_map.put(20, "Geeks");
 tree_map.put(25, "Welcomes");
 tree_map.put(30, "You");
 System.out.println("TreeMap: " + tree_map);
	 Set<String> ts1 = new TreeSet<>();
     ts1.add("A");
     ts1.add("B");
     ts1.add("C");
     ts1.add("C");
     System.out.println(ts1);
  HashSet<String> set=new HashSet<String>();  
           set.add("Ravi");  
           set.add("Vijay");  
           set.add("Arun");  
           set.add("Sumit");  
           System.out.println("An initial list of elements: "+set);   
           set.remove("Ravi");  
           System.out.println("After invoking remove(object) method: "+set);  
           HashSet<String> set1=new HashSet<String>();  
           set1.add("Ajay");  
           set1.add("Gaurav");  
           set.addAll(set1);  
           System.out.println("Updated List: "+set);   
           set.removeAll(set1);  
           System.out.println("After invoking removeAll() method: "+set);  
           set.removeIf(str->str.contains("Vijay"));    
           System.out.println("After invoking removeIf() method: "+set);  
           set.clear();  
           System.out.println("After invoking clear() method: "+set);  
 }  
}  