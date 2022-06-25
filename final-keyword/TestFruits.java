enum Apple{
	A(500),B(300),C(150);
	int price;
	Apple(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
}
class TestFruits{
	public static void main(String[] args){
		System.out.println("A-Grade apple :" + Apple.A.getPrice());
		System.out.println("B-Grade apple :" + Apple.B.getPrice());
		System.out.println("C-Grade apple :" + Apple.C.getPrice());
	}
}
