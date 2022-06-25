class CurrentClsObject{
	CurrentClsObject getRef1(){
		CurrentClsObject cco = new CurrentClsObject();
		return cco;
	}
	
	CurrentClsObject getRef2(){
		
		return this;
	}
	
}

class TestCurrentClsObject{
	public static void main(String[] args){
		CurrentClsObject cco = new CurrentClsObject();
		System.out.println(cco);
		System.out.println(cco.getRef1());
		System.out.println(cco.getRef1());
		System.out.println(cco.getRef1());
		System.out.println(cco.getRef1());
		
		System.out.println();
		System.out.println(cco.getRef2());
		System.out.println(cco.getRef2());
		System.out.println(cco.getRef2());
		System.out.println(cco.getRef2());
	}
}