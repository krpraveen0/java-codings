class FinalMethod{
	// final void m1(){
		// System.out.println("method m1");
	// }
	void m1(){
		System.out.println("method m1");
	}
}

class Test extends FinalMethod{
	// void m1(){
		// System.out.println("method m1 from child class");
	// }
	final void m1(){
		System.out.println("method m1 from child class");
	}
}

class TestFinalMethod{
	public static void main(String[] args){
		FinalMethod fm = new Test();
		fm.m1();
	}
}