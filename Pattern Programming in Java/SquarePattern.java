//wap to create 5x5 square patter with * 
class SquarePattern{
	public static void main(String[] args){
		//creating rows
		for ( int i = 0 ; i<5; i++){
			//creating columns of the row
			for( int j = 0; j<5; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}