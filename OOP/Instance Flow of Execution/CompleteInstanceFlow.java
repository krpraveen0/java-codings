class CompleteInstanceFlow{
	//defined m1()
	int m1(){
		System.out.println("m1 method");
		return 10;
	}
	//Instance Block
	{
		System.out.println("First Instance Block");
	}
	//calling the m2()
	int i = m2();
	//constructor
	CompleteInstanceFlow(){
		System.out.println("InstanceElementsFlow constructor");
	}
	//calling the m1()
	int j = m1();
	//second Instance Block
	{
		System.out.println("Second Instance Block");
	}
	//defined m2()
	int m2(){
		System.out.println("method m2()");
		return 20;
	}
	
	
}

class TestCompleteInstanceFlow{
	public static void main(String[] args){
		CompleteInstanceFlow ief = new CompleteInstanceFlow();
		System.out.println("Creating object for the second time");
		CompleteInstanceFlow ief2 = new CompleteInstanceFlow();
		
	}
}