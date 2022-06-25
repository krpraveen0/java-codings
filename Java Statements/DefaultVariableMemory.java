class DefaultVariableMemory{
	//class level variables have default values depending upon the data type
	static int i ; // default value is 0
	
	//method
	static void demo(){
		//local variable of demo() it has no default value
		int j;
		System.out.println("The value of i is: " + i);
		//System.out.println("The value of j is : " + j);
		//initializing the local variable j
		j = 20;
		System.out.println("The value of j is : " + j);
		
	}
	public static void main(String[] args){
		DefaultVariableMemory.demo();
	}
}