class MethodArg{
	void add(int i, int j){
		System.out.println("The sum is : " +  (i+j));
	}
	
}

class Demo{
	public static void main(String[] args){
		MethodArg ma = new MethodArg();
		ma.add(4,5);
		//ma.add(4); method call with n-1 arg
		ma.add(2,3,4);
	}
}