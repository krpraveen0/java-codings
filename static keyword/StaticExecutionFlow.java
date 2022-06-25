class StaticExecutionFlow{
	static int i = m2();
	//constructor
	StaticExecutionFlow(){
		System.out.println("Constructor of the class");
	}
	//method m1()
	static int m1(){
		System.out.println("Static method - A");
		return 10;
	};
	//static block
	static{
		System.out.println("Static Block - A");
	};
	static int j = m1();{    //instance block
		System.out.println("Instance Block A");
	}
	static int m2(){
		System.out.println("Static method m2() - B");
		return 20;
	}
	// static int j = m1();
	
}

class TestStaticExecutionFlow{
	public static void main(String[] args){
		StaticExecutionFlow sef1 = new StaticExecutionFlow();
		StaticExecutionFlow sef2 = new StaticExecutionFlow();
	}
}