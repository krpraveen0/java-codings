class ThisObject{
	ThisObject getRef1(){
			ThisObject to = new ThisObject();
			return to;
	}
	ThisObject getRef2(){
			return this;
	}
}
class TestThisObject{
	public static void main(String[] args){
		ThisObject a = new ThisObject();
		System.out.println("The value of a is: " + a);
		System.out.println();
		System.out.println("getting reference 1 variable: " + a.getRef1());
		System.out.println("getting reference 2 variable: " + a.getRef2());
	}
}