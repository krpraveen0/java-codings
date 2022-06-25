class ObjectToString{
	
}

class TestObjectToString{
	public static void main(String[] args){
		ObjectToString o = new ObjectToString();
		
		String ref = o.toString();
		System.out.println(ref);
		System.out.println(o.toString());
		System.out.println(o);
	}
}