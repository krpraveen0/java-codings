class Employee{
	int empNo;
	String empName = "Deepika";
	String empAddress = "Bangalore";
	Employee(){
		empAddress = "Hyderabad";
	}
}

class TestEmployee{
	public static void main(String[] args){
		//creating an employee object
		Employee emp = new Employee();
		System.out.println("The employee address is :" + emp.empAddress);
		System.out.println("The employee number is :" + emp.empNo);
		System.out.println("The employee name is : " + emp.empName);
	}
}