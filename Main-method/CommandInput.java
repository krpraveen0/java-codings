import java.io.*;
import java.util.*;
class CommandInput{
	String a,b;
	void sum(){
		System.out.println("The product of a & b is : " + (a + b));
	}
}

class TestCommandInput{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		CommandInput ci = new CommandInput();
		// ci.a = sc.nextInt();
		// ci.b = sc.nextInt();
		ci.a = args[0];
		ci.b = args[1];
		ci.sum();
	}
}