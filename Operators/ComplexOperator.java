class ComplexOperator{
	public static void main(String[] args){
		int num = 5,  a = 10;
		//System.out.println(++num - ++num);
		System.out.println((--a + --a) * (++a - a--) + (--a + a--) * (++a + a++));
	}
}