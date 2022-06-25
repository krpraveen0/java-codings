class Employee{
	//variables - data - 
	String eId = "E-101";
	String eName = "Java";
	float eSal = 38878970.0f;
	String eAddr = "Bangalore";
	String email = "Java@gmail.com";
	String contact = "91-9922334455";
	// method
	public void displayEmpDetails(){
		System.out.println("The employee Details are: ");
		System.out.println("-----------------------------------------------");
		System.out.println("The employee Id is : " + eId);
		System.out.println("The employee Name is : " + eName);
		System.out.println("The employee Salary is : " + eSal);
		System.out.println("The employee Address is : " + eAddr);
		System.out.println("The employee email  is : " + email);
		System.out.println("The employee contact is : " + contact);
	}
	public static void main(String[] args){
		//object creation
		Employee emp = new Employee();
		emp.displayEmpDetails();
	}
	
}
