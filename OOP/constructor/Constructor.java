class Constructor{
	//constructor changed into normal method
	//void Constructor(){
	//	System.out.println("Constructor");
	//}
	//static Constructor(){
	//	System.out.println("Constructor");
	//}
	private Constructor(){
		System.out.println("I am private Constructor");
	}
	public static void main(String[] args){
		//object for the Constructor class
		Constructor con = new Constructor();
		//calling the constructor method on con variable
		//con.Constructor();
	}
}