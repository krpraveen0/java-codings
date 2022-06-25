class Mutability{
	public static void main(String[] args){
		String str1 = new String("Deepika");
		String str2 = str1.concat("Software");
		//making some modification on str2 reference.
		String str3 = str2.concat(" Developer");
		System.out.println("String one: " + str1);
		System.out.println("String two: " + str2);
		System.out.println("String three: " + str3);
		
		System.out.println();
		
		//creating an object of StringBuffer class
		StringBuffer sb1  = new StringBuffer("Deepika");
		StringBuffer sb2 = sb1.append("Software");
		StringBuffer sb3 = sb2.append("Developer");
		System.out.println("StringBuffer one:" + sb1);
		System.out.println("StringBuffer two: " +  sb2);
		System.out.println("StringBuffer three: " + sb3);
		
	}
}