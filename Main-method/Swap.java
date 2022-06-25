class Swap{
	int a = 10;
	int b = 20;
	int temp;
	void swap(){
		this.temp = this.a;
		this.a = this.b;
		this.b = this.temp;
		System.out.println("The value of a is : " + this.a);
		System.out.println("The value of b is : " + this.b);
	}
}

class TestSwap{
	public static void main(String[] args){
		Swap s = new Swap();
		s.swap();
	}
}