package Employee;
/*Employees
2.1>>Create a class called Employee whose objects are records for an employee. 
\This class will be a derived class of the class Person which you will have to 
copy into a file of your own and compile. An employee record has an employee’s name 
(inherited from the class Person), an annual salary represented as a single value of type double, a year the employee started work as a single value of type int and a national insurance number, which is a value of type String.
2.2>>Your class should have a reasonable number of constructors and accessor methods, 
as well as an equals method. Write another class containing a main method to 
fully test your class definition. */
class Person{
	String name;
	Person(){
		System.out.println("main class");
	}
}
class PersonEmploy extends Person{
	int salary;
	//super();
	PersonEmploy(String name,int salary) {
		super();
		this.name=name;
		this.salary=salary;
	}
	void display() {
		System.out.println("salary is "+salary+" name is "+name);
	}
}
public class Employ {
  public static void main(String[] args) {
	PersonEmploy object=new PersonEmploy("sarvesh",800000);
	object.display();
  }
}
