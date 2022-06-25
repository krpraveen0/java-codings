class InstanceElementsFlow{
	
	InstanceElementsFlow(){
		System.out.println("InstanceElementsFlow constructor");
	}
	{
		System.out.println("Instance Block");
	}
	int m1(){
		System.out.println("m1 method");
		return 10;
	}
	int i = m1();
}

class TestInstanceElementsFlow{
	public static void main(String[] args){
		InstanceElementsFlow ief = new InstanceElementsFlow();
	}
}