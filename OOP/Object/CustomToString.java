class CustomToString{
	//CustomToString Class containse the data about an employee
	String eid = "D-101";
	String ename = "Deepika";
	float esal = 500000.0f;
	String eaddr = "Bangalore";
	String eemail = "deepika@gmail.com";
	String emobile = "91345678988";
	
	//custom toString()
	public String toString(){
		System.out.println("Employee Details: ");
		System.out.println("_______________________________________________________________");
		System.out.println("Employee Id: " + eid);
		System.out.println("Employee Name: " + ename);
		System.out.println("Employee Salary: " + esal);
		System.out.println("Employee Address: " + eaddr);
		System.out.println("Employee Email: " + eemail);
		System.out.println("Employee Mobile: " + emobile);
		return "";
	}
}

class TestCustomToString{
	public static void main(String[] args){
		//creating an object of CustomToString class
		CustomToString emp = new CustomToString();
		System.out.println(emp);
	}
}