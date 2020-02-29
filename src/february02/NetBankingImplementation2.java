package february02;

public abstract class NetBankingImplementation2 extends NetBankingImplementation1 {
	
	
	public void setPassword() {
		System.out.println("Set your password");
	}
	
	public void resetPassword() {
		System.out.println("Reset your password");
	}
	
	public void mobile() {
		System.out.println("Pay your mobile bills");
	}
	
	public void mutualFund() {
		System.out.println("Pay mutual fund bills");
	}
	
	public abstract void rtgs();

}
