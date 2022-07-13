package Employee;
/*reate a constructor (Parameterized to read) the below details. 
Each program should be created in different packages and classes

1. User detatils (user id, user fname, userlname, usetcity)
2. Employee details (empid,empfname,emplaname,empcity,empstate)
3. Product detailos (pid, pname, pdescription, pprice)
4. Order details (ordid,ordname,orddescription,ordprice)*/
class constr{
	//User detatils
			int user_id;
			String user_fname;
			String user_lname;
			String user_city;
			constr(int user_id,String fname,String lname,String user_city){
				this.user_id=user_id;
				this.user_fname=fname;
				this.user_lname=lname;
				this.user_city=user_city;
			}
			void show() {
				System.out.println("user_id = "+user_id);
				System.out.println("first name = "+user_fname);
				System.out.println("last name = "+user_lname);
				System.out.println("user city = "+user_city);
			}
}

public interface constructors {
   public static void main(String args[]) {
	   constr obj=new constr(1234,"sarvesh","shukla","raebareli");
	   obj.show();
   }
}
