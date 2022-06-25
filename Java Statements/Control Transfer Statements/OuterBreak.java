class OuterBreak{
	public static void main(String[] args){
		//labelled for loop 
		outerLoop: for(int i = 0;i<10;i++){
			//outer loop
			for(int j = 0;j<10;j++){
				//inner loop
				if(j ==5){
					break outerLoop;
				}
				System.out.println("The value of i : " + i + " & the value of j : " + j);
				
			}
		}
	}
}