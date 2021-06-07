import java.util.Scanner;

public class QuestionQuiz implements Runnable{

	private String[] questions= {"How are you?","Your Name ?","Your Interest ?"};
	private Quiz quiz;
	
	
	public QuestionQuiz(Quiz quiz) {
		super();
		this.quiz = quiz;
	}


	public void run() {
		for(String question:questions) {
			quiz.showQuestion(question);
		}
	}
}
