class LabelledBreak{
	public static void main(String[] args){
		
		for(int i = 0;i<10;i++){
			//outer loop
			for(int j = 0;j<10;j++){
				//inner loop
				if(j ==5){
					break;
				}
				System.out.println("The value of i : " + i + " & the value of j : " + j);
				
			}
		}
	}
}