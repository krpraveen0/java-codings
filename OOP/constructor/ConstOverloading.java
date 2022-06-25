class ConstOverloading{
	int num1,num2,num3;
	//0-arg constructor
	ConstOverloading(){}
	//single param constructor
	ConstOverloading(int first_number ){
		num1 = first_number;
	}
	//two param constructor
	ConstOverloading(int first_number, int second_number){
		num1 = first_number;
		num2 = second_number;
	}
	//three param constructor
	ConstOverloading(int first_number, int second_number, int third_number){
		num1 = first_number;
		num2 = second_number;
		num3 = third_number;
	}
	
	void add(){
		System.out.println("The addition is : " + (num1 + num2 + num3 ));
	}
}

class TestConstOverloading{
	public static void main(String[] args){
		ConstOverloading co1 = new ConstOverloading();
		co1.add();
		ConstOverloading co2 = new ConstOverloading(5);
		co2.add();
		ConstOverloading co3 = new ConstOverloading(5,5);
		co3.add();
		ConstOverloading co4 = new ConstOverloading(5,5,5);
		co4.add();
	}
}