package chap06.execises.p19;

public class Account {
	
	private int balance;
	
	void setBalance(int balance) {
		if(balance <= 0) {
			this.balance = balance;
			return;
		} else {
			this.balance = balance;
		}	
	}
	
	
}
