class DemoInstance{
	int i =  10 ;
	int j = 20;
	public static void main(String[] args){
		//an object is created 
		DemoInstance d = new DemoInstance();
		System.out.println("The object created has reference value of: "+ d);
		for (int i =1; i<=10;i++){
			d.i = d.i + 1;
			d.j = d.j + 1;
			System.out.println("The instance number" + i + "has value of i :" + d.i + " and value of j : " + d.j);
		}
	}
}