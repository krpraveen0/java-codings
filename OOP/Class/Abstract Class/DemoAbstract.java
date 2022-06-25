//create an abstract class
abstract class DemoAbstract{
	//concrete method
	void m1(){
		System.out.println("method-one");
	}
	//abstract methods
	abstract void m2();
	abstract void m3();
}

//sub class of DemoAbstract class

class DemoImplement extends DemoAbstract{
	void m2(){
		System.out.println("Implementation of method -2 in sub class");
	}
	void m3(){
		System.out.println("Implementation of method -3 in sub class");
	}
	void m4(){
		System.out.println("concrete method of the child class");
	}
}

class Test{
	public static void main(String[] args){
		// creating object of an abstract class 
		//DemoAbstract parentObj = new DemoAbstract();
		//creating an child class object and refering it to a parent abstract class
		DemoAbstract obj = new DemoImplement();
		obj.m1();
		obj.m2();
		obj.m3();
		//calling a method which is not available to both the classes.
		//obj.m4();
		DemoImplement childObj = new DemoImplement();
		childObj.m1();
		childObj.m2();
		childObj.m3();
		//this method is present only in the sub/child class
		childObj.m4();
		
		
		
		
	}
}