package chpt06.sec04;

public class Car1 {
	//�ʵ�
	int gas;
	
	//�޼ҵ� (gas setting)
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean viewgas() {
		if(gas == 0) {
			System.out.println("gas�� �����.");
			return false;
		}
		System.out.println("gas��"+gas+"��ŭ �־��.");
		return true;
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("�޷���. -(�����ܷ� : "+gas+")");
				gas--;
			}else {
				System.out.println("�����. -(�����ܷ� : "+gas+")");
				return; //while ����
			}
		}
	}
	
	
	
	
}