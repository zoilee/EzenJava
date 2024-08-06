package chpt06.sec04;

public class Car {
	int gas;
	
	void setGas(int x) {
		gas += x;
	};
	
	boolean viewGas(boolean x) {
		if(gas > 0) {
			System.out.println("gas가 "+gas+"만큼 있습니다.");
		}else {
			System.out.println("gas가 없습니다.");
		}
		return false;
		
	};
	
	void run() {
		while(gas >0) {
			System.out.println("달립니다. (gas 잔량 : "+gas+")");
			gas--;
			if(gas == 0) {
				System.out.println("멈춥니다. (gas 잔량 : "+gas+")");
			}
		};
	}
	
	
}
