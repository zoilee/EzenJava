package scoreCard.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import scoreCard.spring.di.entity.Exam;
import scoreCard.spring.di.entity.ScoreCardExam;
import scoreCard.spring.di.ui.ExamConsole;

public class ViewExam {

	public static void main(String[] args) {
		
		Exam exam = new ScoreCardExam();
		//ExamConsole console = new KRExamConsole(exam);
		//ExamConsole console = new JAPExamConsole(exam);
		//ExamConsole console = new ENGExamConsole(exam);
		//console.setExam(exam);
		//ExamConsole console = 
	
		ApplicationContext context = new ClassPathXmlApplicationContext("scoreCard/spring/di/entity/spring_config.xml");
		
		//ExamConsole console = context.getBean(ExamConsole.class);
		ExamConsole console = (ExamConsole) context.getBean("consoleen");
		console.print();
	}

}
