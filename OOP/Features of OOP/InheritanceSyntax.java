class Employee{
	String emp_id;
	String emp_name;
	String emp_addr;
	...
	...
	void getEmpDetails(){
		System.out.println("The employee id is: " + this.emp_id);
		...
		....
	}
	
}

class Manager extends Employee{
	---Reuse the variable and methods of Employee class ---
	String no_of_teams ;
	--- Manager specific variables and methods ---
}
class Accountant extends Employee{
	---Reuse the variable and methods of Employee class ---
	String no_of_accounts;
	--- Accountant specific variables and methods ---
}
class Engineer extends Employee{
	---Reuse the variable and methods of Employee class ---
	String no_of_sites ;
	--- Engineer specific variables and methods ---
}