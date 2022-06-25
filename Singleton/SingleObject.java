class SingleObject{
	static{
		System.out.println("Class loading");
	}
	SingleObject(){
		System.out.println("Object creating");
	}
}

class TestSingleObject{
	public static void main(String[] args){
		SingleObject so = new SingleObject();
	}
}