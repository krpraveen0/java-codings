class Branch{
	String bId;
	String bName;
	Branch(String bId,String bName){
		this.bId = bId;
		this.bName = bName;
	}
	
}

class Student{
	String sId;
	String sName;
	String addr;
	Branch branch;
	Student(String sId, String sName, String addr, Branch branch){
		this.sId = sId;
		this.sName = sName;
		this.addr = addr;
		this.branch = branch;
	}
	public void getStudentDetails(){
		System.out.println("Student Details: ");
		System.out.println(".....................................");
		System.out.println("Student Id: " + sId);
		System.out.println("Student Name: " + sName);
		System.out.println("Student Address: " + addr);
		System.out.println("Branch Id: " + branch.bId);
		System.out.println("Branch Name: " + branch.bName);
		System.out.println();
		
	}
}

//Many to one association - many student can take admission in the same branch.
class ManyToOne{
	public static void main(String[] args){
		Branch branch = new Branch("B-101","CSE");
		Student std1 = new Student("S1", "Deppika", "Bangalore", branch);
		Student std2 = new Student("S2", "Aditya", "Bangalore", branch);
		Student std3 = new Student("S3", "Depanshu", "Hyderabad", branch);
		Student std4 = new Student("S4", "shekhar", "Kashmir", branch);
		Student std5 = new Student("S5", "Kanika", "Bengal", branch);
		Student std6 = new Student("S6", "Mukesh", "Bihar", branch);
		std1.getStudentDetails();
		std2.getStudentDetails();
		std3.getStudentDetails();
		std4.getStudentDetails();
		std5.getStudentDetails();
		std6.getStudentDetails();
		
		
		
	}
}