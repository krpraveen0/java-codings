class BooleanOperator{
	public static void main(String[] args){
		boolean firstDecesion = true;
		boolean secondDecesion = false;
		System.out.println(firstDecesion && secondDecesion);
		System.out.println(firstDecesion && firstDecesion);
		System.out.println(secondDecesion && firstDecesion);
		System.out.println(secondDecesion && secondDecesion);
		
		
		System.out.println(firstDecesion || secondDecesion);
		System.out.println(firstDecesion || firstDecesion);
		System.out.println(secondDecesion || firstDecesion);
		System.out.println(secondDecesion || secondDecesion);
		
		
		System.out.println(firstDecesion ^ secondDecesion);
		System.out.println(firstDecesion ^ firstDecesion);
		System.out.println(secondDecesion ^ firstDecesion);
		System.out.println(secondDecesion ^ secondDecesion);
		
		
	}
	
}