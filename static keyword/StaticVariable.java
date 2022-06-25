class StaticVariable{
	static int i =10;
	int j = 20;
	void m1(){
		// static int k = 45;
		System.out.println("The value of static variable i: " + i);
	System.out.println("The value of static variable accessed with this keyword: " + this.i);
		
	}
}

class TestStaticVariable{
	public static void main(String[] args){
			StaticVariable sv = new StaticVariable();
			System.out.println("accessing the static variable with object reference:" + sv.i);
			System.out.println("accessing the static variable with its reference variable: " + StaticVariable.i);
			sv.m1();
			// StaticVariable sv2 = null;
			System.out.println("The static variable is :" + sv.i);
	}
}