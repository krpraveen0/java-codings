class ForloopArr{
	public static void main(String[] args){
		//created an array with reference variable a
		int [] a = {1,2,3,4,5};
		//finding the lenght of the given array
		int size = a.length;
		for(int i =0; i < size; i++){
			System.out.println("The item at index" + i + " is : " + a[i] );
		}
	}
	
}