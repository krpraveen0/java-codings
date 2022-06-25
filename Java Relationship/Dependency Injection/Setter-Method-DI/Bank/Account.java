package Bank;

public class Account{
	private String accNo;
	private String accHolderName;
	private String accType;
	private float accBalance;
	
	// public Account(String accNo,String accHolderName, String accType, float accBalance){
		// this.accNo = accNo;
		// this.accHolderName = accHolderName;
		// this.accType = accType;
		// this.accBalance = accBalance;
	// }
	
	// setter methods
	public void setAccNo(String accNo){
		this.accNo = accNo;
	}
	public void setAccHolderName(String accHolderName){
		this.accHolderName = accHolderName;
	}
	public void setAccType(String accType){
		this.accType = accType;
	}
	public void setAccBalance(float accBalance){
		this.accBalance = accBalance;
	}
	
	//getter methods 
	public String getAccNo(){
		return accNo;
	}
	public String getAccHolderName(){
		return accHolderName;
	}
	public String getAccType(){
		return accType;
	}
	public float getAccBalance(){
		return accBalance;
	}
}