package scoreCard.spring.di.ui;

import scoreCard.spring.di.entity.Exam;

public class ENGExamConsole implements ExamConsole {

	
	private Exam exam;
	
	public ENGExamConsole() {};
	
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}


	public ENGExamConsole(Exam exam) {
		this.exam = exam;
	}
	@Override
	public void print() {
		System.out.printf("You have a total socre of  %d and an average of %f.", exam.total(), exam.avg());

	}

}
