class ImplicitTypeCasting{
	public static void main(String[] args){
		
		byte b = 10;
		int i = b;
		byte temp = i;
		System.out.println("The converted data is " + i);
		System.out.println("The byte of integer is" + temp);
	}
}