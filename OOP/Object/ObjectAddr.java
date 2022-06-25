class ObjectAddr{
	
}

class TestObjectAddr{
	public static void main(String[] args){
		ObjectAddr o = new ObjectAddr();
		int hashCode = o.hashCode();
		System.out.println("Object HashCode :" + hashCode);
		String ref = o.toString();
		System.out.println("Object reference is: " + ref);
	}
}