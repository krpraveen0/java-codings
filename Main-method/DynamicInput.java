import java.io.*;
import java.util.*;
class DynamicInput{
	int a,b;
	void sum(){
		System.out.println("The sum of a & b is : " + (a+b));
	}
	void product(){
		System.out.println("The product of a & b is : " + (a*b));
	}
}

class TestDynamicInput{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		DynamicInput di = new DynamicInput();
		di.a = sc.nextInt();
		di.b = sc.nextInt();
		di.sum();
		di.product();
	}
}