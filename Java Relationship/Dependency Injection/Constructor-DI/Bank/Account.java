package Bank;

public class Account{
	String accNo;
	String accHolderName;
	String accType;
	float accBalance;
	
	public Account(String accNo,String accHolderName, String accType, float accBalance){
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.accType = accType;
		this.accBalance = accBalance;
	}
}