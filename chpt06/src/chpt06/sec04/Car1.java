package chpt06.sec04;

public class Car1 {
	//필드
	int gas;
	
	//메소드 (gas setting)
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean viewgas() {
		if(gas == 0) {
			System.out.println("gas가 없어용.");
			return false;
		}
		System.out.println("gas가"+gas+"만큼 있어용.");
		return true;
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달려용. -(가스잔량 : "+gas+")");
				gas--;
			}else {
				System.out.println("멈춰용. -(가스잔량 : "+gas+")");
				return; //while 종료
			}
		}
	}
	
	
	
	
}
