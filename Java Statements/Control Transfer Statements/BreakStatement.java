class BreakStatement{
	public static void main(String[] args){
			for(int i = 0; i<10; i++){
			System.out.println("Start of the loop number: " + i);
			if(i ==5){
				System.out.println("Its Danger situation... Escaping from here...." + i);
				break;
				System.out.println(" Logic just after break statement");
			}
			System.out.println(" Program being executed for the result..");
		}
	}
}