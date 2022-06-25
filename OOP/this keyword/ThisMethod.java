class ThisMethod{
	void m1(){
		System.out.println("method m1()");
	}
	void m2(){
		System.out.println("method m2()");
		m1();
		this.m1();
	}
	
}

class TestThisMethod{
	public static void main(String[] args){
		ThisMethod tm = new ThisMethod();
		tm.m2();
	}
}