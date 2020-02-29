package february02;

public abstract class NetBankingImplementation1 implements NetBanking {
	
	public void setUserName() {
		System.out.println("You can set your username");
	}
	
	public void neft() {
		System.out.println("You can transfer money via neft");
	}
	
	public void electricity() {
		System.out.println("Pay your electricity bills");
	}
	
	public void gas() {
		System.out.println("Bool your gas cylinders online");
	}
	

}
