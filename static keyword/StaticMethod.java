class StaticMethod{
	int i = 20;
	static int j = 15;
static void m1(){
	System.out.println("static m1-Method");
	System.out.println(j);
	// System.out.println(i);
	// System.out.println(this.j);
	
	StaticMethod sm = new StaticMethod();
	
	System.out.println("Accessing the non-static variable within a static method: " + sm.i);
}
void m2(){
	System.out.println("This is m2 method");
	//accessing the static method inside a non-static method.
	this.m2();
}

}

class TestStaticMethod{
	public static void main(String[] args){
		StaticMethod sm = new StaticMethod();
		sm.m1();
		sm = null;
		//accessing the static method by using the object reference of respective class.
		sm.m1();
		//accessing the static method by using the respective class name
		StaticMethod.m1();
	}
}