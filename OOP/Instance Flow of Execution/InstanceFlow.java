class InstanceFlow{
	int i = m1();
	int m2(){
		System.out.println("m2-method");
		return 20;
	}
	InstanceFlow(){
		System.out.println("InstanceFlow-Constructor");
	}
	int m1(){
		System.out.println("m1 method");
		return 10;
	}
	int j = m2();
}

class TestInstanceFlow{
	public static void main(String[] args){
		InstanceFlow ins = new InstanceFlow();
	}
}