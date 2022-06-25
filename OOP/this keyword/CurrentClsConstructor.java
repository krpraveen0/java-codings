class CurrentClsConstructor{
	CurrentClsConstructor(){
		// this(10);
		this(10);//first statement of current class constructor;
		this(45.67f);//second statement: constructor call to current class other constructor 
		System.out.println("CurrentClsConstructor 0 arg constructor");
		// this(10);//this doesn't get executed as this need to be in first statement.
	}
	CurrentClsConstructor(int i){
		// this(58.0f);
		System.out.println("CurrentClsConstructor: single arg constructor");
	}
	// this(58.0f);
	CurrentClsConstructor(float f){
		this(10.56);
		System.out.println("CurrentClsConstructor: single arg float constructor");
	}
	// this(58.0f);
	CurrentClsConstructor(double d){
		
		System.out.println("CurrentClsConstructor single arg double constructor");
	}
}

class TestCurrentClsConstructor{
	public static void main(String[] args){
		CurrentClsConstructor ccc = new CurrentClsConstructor();
	}
}