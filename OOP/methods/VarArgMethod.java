class VarArgMethod{
	void add(int ...a) // int[] a = { ... list of arguments..}
		{
			System.out.println("No of Arguments: " + a.length);
			int result = 0;
			System.out.println("Argument List: ");
			for ( int i = 0; i < a.length ; i++){
				System.out.print(a[i] + " ");
				result = result + a[i];
			}
			System.out.println();
			System.out.println("Addition :" + result);
			System.out.println("---------------------");
		}
}

class VarArgMethodTest{
	public static void main(String[] args){
		//created an object of type VarArgMethod class
		VarArgMethod vam = new VarArgMethod();
		//calling add() method without any parameters
		vam.add();
		//calling add() method with single param`
		vam.add(10);
		//calling add() method with double param`
		vam.add(10,23);
		//calling add() method with triple param`
		vam.add(2,4,5);
		//calling add() method with five param`
		vam.add(4,5,6,7,8);
		
	}
}