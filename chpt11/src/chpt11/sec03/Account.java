package chpt11.sec03;

public class Account {
	private long balance;
	
	public long getBalance() {
		return balance;
	}
	public void deposit (int money) {
		balance += money;
	}
	public void withDraw(int money) throws minusException {
		if(balance < money) {
			throw new minusException("잔고 부족 : " + (money - balance)+ " 모자람");
		}
		balance -= money;
	}
}
