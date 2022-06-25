class StaticInput{
	//static inputs 
	int i = 0;
	int j = 20;
	void add(){
		System.out.println("The sum is: " + (i + j));
	}
}
class TestStaticInput{
	public static void main(String[] args){
		StaticInput si = new StaticInput();
		si.add();
	}
}