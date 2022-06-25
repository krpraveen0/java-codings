class Singleton{
	static Singleton s = null;
	private Singleton(){
		
	}
	static Singleton getRef(){
		if(s == null){
			s = new Singleton();
		}else{
			return s;
		}
		return s;
	}
}

class TestSingleton{
	public static void main(String[] args){
		System.out.println(Singleton.getRef());
		System.out.println(Singleton.getRef());
		System.out.println(Singleton.getRef());
	}
}