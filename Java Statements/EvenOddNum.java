class EvenOddNum{
	public static void main(String[] args){
		float num = 0.3f;
		if((num%2) == 0){
			System.out.println(num + " is an even number");
		}else if((num%2) != 0){
			System.out.println(num + " is an odd number");
		}else{
			System.out.println("Kindly enter the correct number");
		}
	}
}