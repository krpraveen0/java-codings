class PredefinedClassToStringMethod{
	public static void main(String[] args){
		//creating an object of String class
		String str = new String("Deepika");
		System.out.println("My string is: " + str);
		
		//creating an object of Exception class
		Exception exp = new Exception("My Own Exception");
		System.out.println("My Own exception is: " + exp);
		
		//creating an object of Thread class
		Thread th = new Thread();
		System.out.println("My Thread is :" + th);
		
		//creating an object of a wrapper class
		Integer in = new Integer(20);
		System.out.println("My integer value is : " + in);
		
		//creating an object of ArrayList
		java.util.ArrayList al = new java.util.ArrayList();
		al.add("Deepika");
		al.add("Developer");
		al.add("Intelligent");
		al.add("Determined");
		System.out.println("The items of the ArrayList are: " + al);
		
		
	}
}