package chpt06.sec08;

public class Sample {
	
	private int num;
	private String name;
	private Boolean real;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getReal() {
		return real;
	}

	public void setReal(Boolean real) {
		this.real = real;
	}

	//필드를 쓰기 setter 필드를 읽기 getter
	public void setNum(int num){
		this.num = num;
	}
	public Sample() {};
	public int getNum() {
		return num;
	}
	
	public Sample(int num, String name, Boolean real) {
		this.num = num;
		this.name = name;
		this.real = real;
	}
	

}
