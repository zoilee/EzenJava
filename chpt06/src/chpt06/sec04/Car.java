package chpt06.sec04;

public class Car {
	int gas;
	
	void setGas(int x) {
		gas += x;
	};
	
	boolean viewGas(boolean x) {
		if(gas > 0) {
			System.out.println("gas�� "+gas+"��ŭ �ֽ��ϴ�.");
		}else {
			System.out.println("gas�� �����ϴ�.");
		}
		return false;
		
	};
	
	void run() {
		while(gas >0) {
			System.out.println("�޸��ϴ�. (gas �ܷ� : "+gas+")");
			gas--;
			if(gas == 0) {
				System.out.println("����ϴ�. (gas �ܷ� : "+gas+")");
			}
		};
	}
	
	
}
