class BitwiseOperation{
	public static void main(String[] args){
		//create variable
		int firstNum =10;
		int secondNum = 2;
		//Bitwise operation using Bitwise operator
		System.out.println("The bitwise AND is: " + (firstNum & secondNum));
		System.out.println("The bitwise OR is: " + (firstNum | secondNum));
		System.out.println("The bitwise XOR is: " + (firstNum ^ secondNum));
		//left and right shift operations
		System.out.println("The bitwise Left Shift is: " + (firstNum << secondNum));
		System.out.println("The bitwise Right Shift is: " + (firstNum >> secondNum));
	}
}