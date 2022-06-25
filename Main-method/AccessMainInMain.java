class A{
	public static void main(String[] args){
		System.out.println("main() of class A");
		String[] str = {"AAA", "BBB", "CCC"};
		//accessing the main method of class B.
		B.main(str);
		//accessing the main method of class B using args[] with 0 item in it.
		B.main(args);
	}
}

class B{
	public static void main(String[] args){
		System.out.println("main() method of class B");
	}
}