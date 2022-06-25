enum Book{
	A(500,200), B(300,250),C(200,50);
	int no_of_pages;
	int cost;
	Book (int no_of_pages, int cost){
		this.no_of_pages = no_of_pages;
		this.cost = cost;
	}
	public void getBookDetails(){
		System.out.println(no_of_pages + " -------> " + cost);
	}
}
class BookEnum{
	public static void main(String[] args){
		System.out.println("Deepika Book Store");
		System.out.println("---------------------------------------------");
		System.out.println(" Number of pages   Cost");
		System.out.println("----------------------------------------------");
		Book.A.getBookDetails();
		Book.B.getBookDetails();
		Book.C.getBookDetails();
	}
}