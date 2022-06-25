class StringSwitch{
	public static void main(String[] args){
		String name = "Puja";
		switch(name){
			case "Deepika":
				System.out.println(name + " is a determined and courageous girl");
				break;
			case "Puja":
				System.out.println(name + "is very intelligent in studies");
				break;
			case "Rohit":
				System.out.println(name + " is very good singer");
				break;
			case "Sumit": 
				System.out.println(name + " failed in the test examination");
				break;
			default:
				System.out.println(name + " is not a valid input");
		}
	}
}