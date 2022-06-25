class Employee{
	String eid;
	String ename;
	String eaddr;
	Employee(String eid, String ename, String eaddr){
		this.eid = eid;
		this.ename = ename;
		this.eaddr = eaddr;
	}
}

//department class
class Department{
	String dId;
	String dName;
	Employee[] emps;
	Department(String dId, String dName, Employee[] emps){
		this.dId = dId;
		this.dName = dName;
		this.emps = emps;
	}
	
	public void getDepartmentDetails(){
		System.out.println("Department Details");
		System.out.println("--------------------------------");
		System.out.println("Department Id: " + dId);
		System.out.println("Department Name: " + dName);
		System.out.println();
		System.out.println("EId	 EName	Eaddrress");
		for(int i=0; i<emps.length; i++){
			Employee e = emps[i];
			System.out.println(e.eid+"	"+e.ename+"	"+e.eaddr);
		}
		
		
	}
}

class OneToManyAssociation{
	public static void main(String[] args){
		Employee e1 = new Employee("D-101","Deepika","Bangalore");
		Employee e2 = new Employee("D-102","Developer Deepika", "India");
		Employee e3 = new Employee("ED-101","Senior Developer Deepika", "Remote");
		Employee[] emps = new Employee[3];
		emps[0]=e1;
		emps[1]=e2;
		emps[2]=e3;
		Department dept = new Department("SWD","Software Intelligence", emps);
		dept.getDepartmentDetails();
	}
}