package scoreCard.spring.di.ui;

import scoreCard.spring.di.entity.Exam;

public class JAPExamConsole implements ExamConsole {

	

	private Exam exam;
	
	
	public JAPExamConsole() {}
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public JAPExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	@Override
	public void print() {
		System.out.printf("당신의 총점은 %d, %f 데스..", exam.total(), exam.avg());

	}

}
