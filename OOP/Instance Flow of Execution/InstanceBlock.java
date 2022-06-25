class InstanceBlock{
	InstanceBlock(){
		System.out.println("InstanceBlock Constructor");
	}
	//instance block
	{
		System.out.println("The instance block");
	}
}
class TestInstanceBlock{
	public static void main(String[] args){
		InstanceBlock ib = new InstanceBlock();
	}
}