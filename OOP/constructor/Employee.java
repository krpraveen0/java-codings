class Employee{
	//class level variables 
	String eid;
	String ename;
	float esal;
	String eaddr;
	//user defined 0-args constructor
	// Employee(){
		// //initialization 
		// eid=" EC-101";
		// ename = "Deepika";
		// esal = 5998098.90f;
		// eaddr = "Bangalore";
	// }
	//parameterized constructor
	Employee(String emp_id, String e_name, float e_sal, String e_addr){
		//initialization 
		eid= emp_id;
		ename = e_name;
		esal = e_sal;
		eaddr = e_addr;
	}
	public void getEmpDetails(){
		System.out.println("-----------------------Employee Details--------------------------");
		System.out.println("Employee ID: " + eid);
		System.out.println("Employee Name: " + ename);
		System.out.println("Employee Salary: " + esal);
		System.out.println("Employee Address: " + eaddr);
	}
	
}

class TestEmployee{
	public static void main(String[] args){
		//Creating Employee class object
		Employee emp1 = new Employee("EC-101","Deepika",589897.0f,"Bangalore");
		emp1.getEmpDetails();
		Employee emp2 = new Employee("EC-102","Ranjan", 5879438.0f,"Hyderabad");
		emp2.getEmpDetails();
		Employee emp3 = new Employee("EC-103","demo",35647475.0f, "Bangalore");
		emp2.getEmpDetails();
	}
}