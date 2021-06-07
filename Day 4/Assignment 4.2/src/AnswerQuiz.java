import java.util.Scanner;

public class AnswerQuiz implements Runnable{

	private String[] answers= {"Good","Aryan","Coding"};
	private Quiz quiz;
	
	
	public AnswerQuiz(Quiz quiz) {
		super();
		this.quiz = quiz;
	}


	public void run() {
		for(String answer:answers) {
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			quiz.showAnswer(answer , s);
		}
	}
}
