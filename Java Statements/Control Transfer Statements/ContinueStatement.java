class ContinueStatement{
	public static void main(String[] args){
		for(int i = 0; i<10;i++){
			if(i ==5){
				System.out.println("The value of i before continue is : " + i);
				continue;
				System.out.println("The value of i after continue is : " + i);
				
			}
			System.out.println("The value of i is : " + i);
		}
	}
}