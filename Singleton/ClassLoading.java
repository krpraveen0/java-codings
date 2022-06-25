class ClassLoading{
	static{
		System.out.println("Class loading");
	}
	ClassLoading(){
		System.out.println("Object creating");
	}
}

class TestClassLoading{
	public static void main(String[] args)throws Exception{
		Class c = Class.forName("ClassLoading");
		Object obj = c.newInstance();
	}
}