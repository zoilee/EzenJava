package chpt07.sec03;

public  class Car {
	//field
	public int speed;
	
	//method
	public void speedup() {
		speed += 1;
	}
	
	public final void stop() {
		System.out.println("Â÷¸¦ ¸ØÃç!");
		speed = 0;
	}
	
}
