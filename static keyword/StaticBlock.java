class StaticBlock{
	int i = 0;
	static int j = 20;
	//static block
	static {
		System.out.println("Static Block-1");
		// System.out.println("Accessing non-static variable i directly inside a static block is: " + i);//error
		//creating object of the current class
		StaticBlock sb = new StaticBlock();
		System.out.println("Accessing non-static variable using object reference i inside a static block "+ sb.i);
		System.out.println("Accessing  static variable is : " + j);
		// System.out.println("Accessing static variable j using this keyword : ", this.j);//error
		
	}
}

class TestStaticBlock{
	public static void main(String[] args){
		StaticBlock sb = new StaticBlock();
		
	}
}