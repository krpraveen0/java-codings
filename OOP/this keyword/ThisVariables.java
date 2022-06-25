class ThisVariables{
	//class level scope
	int i =10, j=20;
	ThisVariables(int i, int j){
		//local scope 
		System.out.println("Local variables i :" + i + " j: " + j);
		System.out.println("Class level variables i: " + this.i + " j : " + this.j);
	}
}

class TestThisVariables{
	public static void main(String[] args){
		ThisVariables tv = new ThisVariables(30,40);
	}
	
}