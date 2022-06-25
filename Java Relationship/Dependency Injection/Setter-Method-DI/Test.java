

import Bank.Employee;
import Bank.Account;
class Test{
	public static void main(String[] args){
		// Account acc = new Account("D101", "Deepika", "Savings", 46346987.00f);
		// Employee emp = new Employee(101,"Deepika",508689689, "Bangalore", acc);
		// emp.getEmpDetails();
		Account acc = new Account();
		//inserting values into Account object
		acc.setAccNo("D101");
		acc.setAccHolderName("Deepika");
		acc.setAccType("Savings");
		acc.setAccBalance(56798.90f);
		
		Employee emp = new Employee();
		emp.setEno(101);
		emp.setEname("Deepika");
		emp.setEaddr("Bangalore");
		emp.setEsal(45746.98f);
		emp.setAcc(acc);
		emp.getEmpDetails();
	}
	
}