package scoreCard.spring.di.ui;

import scoreCard.spring.di.entity.Exam;

public class KRExamConsole implements ExamConsole {

	private Exam exam;
	
	public KRExamConsole() {}
	
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public KRExamConsole(Exam exam) {
		this.exam = exam;
	}


	@Override
	public void print() {
		System.out.printf("당신의 총점은 %d, %f 입니다.", exam.total(), exam.avg());

	}

}
