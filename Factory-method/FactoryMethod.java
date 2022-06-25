class FactoryMethod{
	private FactoryMethod(){
		System.out.println("FactoryMethod constructor");
	}
	void m1(){
		System.out.println("method- m1()");
	}
	// Factory method
	static FactoryMethod getRef(){
		FactoryMethod fm = new FactoryMethod();
		return fm ;
	}
}

class TestFactoryMethod{
	public static void main(String[] args){
		// FactoryMethod fm = new FactoryMethod();
		FactoryMethod fm = FactoryMethod.getRef();
		fm.m1();
	}
}