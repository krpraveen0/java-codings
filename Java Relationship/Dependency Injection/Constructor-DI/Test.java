

import Bank.Employee;
import Bank.Account;
class Test{
	public static void main(String[] args){
		Account acc = new Account("D101", "Deepika", "Savings", 46346987.00f);
		Employee emp = new Employee(101,"Deepika",508689689, "Bangalore", acc);
		emp.getEmpDetails();
	}
	
}