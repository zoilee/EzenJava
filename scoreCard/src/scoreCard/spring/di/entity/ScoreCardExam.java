package scoreCard.spring.di.entity;

public class ScoreCardExam implements Exam {

	private int kor;
	private int eng;
	private int hist;
	private int math;
	private int comp;
	
	


	public ScoreCardExam() {}
	
	public ScoreCardExam(int kor, int eng, int hist, int math, int comp) {
		this.kor = kor;
		this.eng = eng;
		this.hist = hist;
		this.math = math;
		this.comp = comp;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setHist(int hist) {
		this.hist = hist;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setComp(int comp) {
		this.comp = comp;
	}
	
	@Override
	public int total() {
		// TODO Auto-generated method stub
		return kor + eng + hist + math + comp;
	}


	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total() / 5.0f;
	}

}
