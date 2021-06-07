import java.util.Scanner;

public class QuestionAnswerQuizMain {

	public static void main(String args[]) throws InterruptedException {
		Quiz chat=new Quiz();
		int i = 1;
		Thread Teacher=new Thread(new QuestionQuiz(chat),"Teacher");
		Thread Student=new Thread(new AnswerQuiz(chat),"Student");
		
		
		Teacher.start();
		Student.start();
		
	}
}
