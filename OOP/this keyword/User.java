class User{
	private String uname;
	private String upwd;
	public void setUname(String uname){
		this.uname = uname;
	}
	public void setUpwd(String upwd){
		this.upwd = upwd;
	}
	public String getUname(){
		return uname;
	}
	public String getUpwd(){
		return upwd;
	}
}

class TestUser{
	public static void main(String[] args){
		//user class object
		User deepika = new User();
		deepika.setUname("Deepika");
		deepika.setUpwd("Deepika@123");
		System.out.println("The user details are:......................");
		System.out.println("---------------------------------------------------");
		System.out.println("User Name: " + deepika.getUname());
		System.out.println("User Password: " + deepika.getUpwd());
	}
}